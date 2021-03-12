package fr.umontpellier.iut.partie1;

import java.util.ArrayList;
import java.util.Arrays;

public class Taquin {
    private int[][] tableau;

    public Taquin(int[][] tableau) {
        this.tableau = tableau;
    }

    public boolean estGagnant() {
        int n = 0;
        for(int i =0; i < tableau.length; i++){
            for(int j = 0; j < tableau[i].length; j++){
                int res = tableau[i][j];
                if(res == 0 && i == tableau.length-1 && j == tableau[i].length-1) {
                    return true;
                    }
                else if(res != n) {
                }
                else {
                    n += 1;
                }
            }
        }
        return true;
    }

    public ArrayList<Taquin> genererFils() {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }

    // retourne un tableau [i,j] si tableau[i][j]==0
    public int[] trouverTrou() {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }


    @Override
    public String toString() {
        String res = "+-----------+\n";
        String sres = res;
        for( int n = 0; n < tableau.length; n++){
            for (int p = 0; p < tableau[n].length; p++){
                int tab = tableau[n][p];
                sres += p == 0 ? "| " + tab :(p+1 == tableau[n].length ? " " + tab + " |\n" : " ");
            }
        }
        sres += res;
        return sres;
    }


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
}
