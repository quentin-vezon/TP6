package fr.umontpellier.iut.partie1;

public class AppTaquin {
    public static void main(String[] args) {

        int[][] data = { { 1, 2, 0 }, { 4, 5, 3 }, { 7, 8, 6 } };
        Contexte c2 = new Contexte (new Taquin(data));
        c2.resoudre();
        System.out.println(c2.toString());

    }
}
