package TD1;

public class Paire<X, Y> {

    private X fst;
    private Y snd;

    public Paire(X fst, Y snd) {
        this.fst = fst;
        this.snd = snd;
    }

    public X fst() {
        return fst;
    }

    public Y snd() {
        return snd;
    }

    @Override
    public String toString() {
        return "(" + fst + ", " + snd + ") :: Paire" + "[" +
                this.fst.getClass().getSimpleName() + ',' +
                this.snd.getClass().getSimpleName() + "]";
    }

    public static <E, Y> Paire<E, Y> changeFst(Paire<?, Y> paire, E fst) {
        return new Paire<>(fst, paire.snd());
    }

    public static <X, E> Paire<X, E> changeSnd(Paire<X, ?> paire, E snd) {
        return new Paire<>(paire.fst(), snd);
    }

    public static void main(String[] args) {
        Paire<Integer, String> paire1 = new Paire<>(1, "un");
        System.out.println(paire1);
        Paire<?, String> paire2 = Paire.changeFst(paire1, 1.0);
        System.out.println(paire2);
        Paire<?, ?> paire3 = Paire.changeSnd(paire2, paire1);
        System.out.println(paire3);
    }
}
