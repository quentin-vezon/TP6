package fr.umontpellier.iut.partie2;

import java.util.ArrayList;
import java.util.Arrays;

public class Hanoi implements JeuPuzzle{

    private int taille;
    private ArrayList<Integer> t1;
    private ArrayList<Integer> t2;
    private ArrayList<Integer> t3;

    public Hanoi(int taille) {
        /* créé un hanoi avec la configuration suivante :
                * sur la tour 1 les disques [taille,taille-1, .., 1]
                * rien sur les tour 2 et 3 (elles sont vides)

         */
        this.taille= taille;
        t1 = new ArrayList<>();
        t2=new ArrayList<>();
        t3=new ArrayList<Integer>();

        for(int i=0; i< taille; i++){
            t1.add(taille-i);
        }

    }


    public Hanoi(ArrayList<Integer> tour1, ArrayList<Integer> tour2, ArrayList<Integer> tour3, int taille) {
        /*
        Crée un hanoi où la tour 1 (resp. tour 2 et tour 3) contient les entiers de tour1 (resp. tour2 et tour3). Par exemple,
        si tour1 est une ArrayList contenant [3,2,1], et tour2 et tour3 sont des ArrayList vides, alors
        Hanoi(tour1, tour2, tour3) doit créer la même configuration que Hanoi(3).
         */
    }


    public boolean estGagnant(){

        if(!(t1.isEmpty() && t2.isEmpty()))
            return false;

        for(int i=0; i< taille; i++){
            if (t3.get(i)!=(taille-i)) {
                return false;
            }
        }
        return true;
    }


    public ArrayList<JeuPuzzle> genererFils() {


    }

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taquin taquin = (Taquin) o;
        if (tableau.length != taquin.tableau.length) {
            return false;
        }
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i].length != taquin.tableau[i].length) {
                return false;
            }

            for (int j = 0; j < tableau[i].length; j++) {
                if (tableau[i][j] != taquin.tableau[i][j]) {
                    return false;
                }
            }

        }
        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(tableau);
    }
}*/
}
