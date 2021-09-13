package TD1;
public class Paire <X,Y>{

    private X fst;
    private Y snd;

    public Paire(X fst, Y snd) {
        this.fst = fst;
        this.snd = snd;
    }

    public X getFst() {
        return fst;
    }
    public Y getSnd(){
        return snd;
    }

    @Override
    public String toString() {
        return "Paire{" +

                "(fst=" + fst +") , (snd=" + snd + ") ::Paire"+ "["+

                this.fst.getClass().getSimpleName()+',' +
                this.snd.getClass().getSimpleName()+"]"+'}'

                ;
    }

    public  <A> Paire < A,Y > changeFst (A fst){
        return new Paire(fst, this.getSnd() );
    }

    public  <A> Paire < X,A > changeSnd (A snd){
        return new Paire(this.getFst(),snd );
    }



}
