package fr.umontpellier.iut.partie1;

import java.util.ArrayList;
import java.util.Arrays;

public class Taquin {
    private int[][] tableau;

    public Taquin(int[][] tableau) {
        this.tableau = tableau;
    }

    public boolean estGagnant() {
        int n = 1;
        for(int i =0; i < tableau.length; i++){
            for(int j = 0; j < tableau[i].length; j++){
                int res = tableau[i][j];
                if(res == 0 && i == tableau.length-1 && j == tableau[i].length-1) {
                    return true;
                    }
                else if(res != n) {
                    return false;
                }
                else {
                    n += 1;
                }
            }
        }
        return true;
    }

    public ArrayList<Taquin> genererFils() {

       int[] TrouXY = trouverTrou();
       int x = TrouXY[0];
       int y = TrouXY[1];
       ArrayList<Taquin> List = new ArrayList<>();

       if(x > 0){
           int[][] Copiertab = this.CopieTab();
           Copiertab[x][y] = Copiertab[x-1][y];
           Copiertab[x-1][y]=0;
           List.add(new Taquin(Copiertab));
       }

        if(x < tableau.length - 1){
            int[][] Copiertab = this.CopieTab();
            Copiertab[x][y] = Copiertab[x+1][y];
            Copiertab[x+1][y]=0;
            List.add(new Taquin(Copiertab));
        }

        if(y > 0){
            int[][] Copiertab = this.CopieTab();
            Copiertab[x][y] = Copiertab[x][y-1];
            Copiertab[x][y-1]=0;
            List.add(new Taquin(Copiertab));
        }

        if(y < tableau[x].length - 1){
            int[][] Copiertab = this.CopieTab();
            Copiertab[x][y] = Copiertab[x][y+1];
            Copiertab[x][y+1]=0;
            List.add(new Taquin(Copiertab));
        }
        return List;
    }

    private int[][] CopieTab(){
        int [][] tab = new int[this.tableau.length][this.tableau[0].length];
        for(int i=0; i< tableau.length; i++){
            for(int j=0; j< tableau[i].length; j++){
                tab[i][j] = tableau[i][j];
            }
        }
        return tab;


    }
    // retourne un tableau [i,j] si tableau[i][j]==0
    public int[] trouverTrou() {
        int n = 0;
        int [] tab = new int [2];
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                int res = tableau[i][j];
                if(res == 0){
                    tab[0] = i;
                    tab[1] = j;
                    return(tab);

                }

            }
        }
    int[] tab2 = new int[1];
        tab2[0] = -1;
        return tab2;
    }

    @Override
    public String toString() {
        String chaine = "";
        for (int i = 0; i < tableau.length; i++) {
            chaine += "|";
            for (int j = 0; j < tableau[i].length; j++) {
                if (tableau[i][j] < 10) {
                    chaine += " 0" + tableau[i][j];
                } else
                    chaine += " " + tableau[i][j];
            }
            chaine += " |\n";
        }
        return chaine;
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
