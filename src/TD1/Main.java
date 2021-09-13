package TD1;

public class Main {

    public static void main (String[] args) {
        /*int a = 5;
        String b ="Back in black";
        Paire p= new Paire(1,"AC CD");

        System.out.println(p.toString());*/

        //Paire paire = new Paire( paire.changeFst(1, 2));

        Paire <Double , String> p0 = new Paire(1,"Hello word");

        System.out.println("Ici p0  -->  "+p0.toString());

        Paire p1 = p0.changeFst(2);

        System.out.println("Ici p1 -->  "+p1.toString());


        Paire <Double , String > p2 = new Paire (2, "Salut");

        System.out.println("Ici p0  -->  "+p2.toString());

        Paire p3 = p2.changeSnd("Pas salut");

        System.out.println("Ici p0  -->  "+p3.toString());



    }
}


