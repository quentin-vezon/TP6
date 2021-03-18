package fr.umontpellier.iut.partie1;

import java.util.ArrayList;

public class Contexte {

    private Taquin taquinInitial;
    private ArrayList<Taquin> solution;

    public Contexte(Taquin taquinInitial) {
        this.taquinInitial = taquinInitial;
        solution = new ArrayList<>();

    }

    public void resoudre() {

            Taquin t = taquinInitial;
            ArrayList<Couple> frontiere = new ArrayList<>();
            ArrayList<Taquin> dejaVu = new ArrayList<>();
            Couple temp = new Couple(t,null);
            int res=0;
            while (res!=1){
                temp.mettreAJour(frontiere,dejaVu);
                if(temp.getTaquin().estGagnant()){
                    solution = temp.getListeDeMouvements();
                    res = 1;
                    break;
                }
                frontiere.remove(temp);
                if(frontiere.isEmpty()){
                    solution = null;
                    res = 1;
                    break;
                }
                System.out.println(temp.getTaquin().toString());
                temp = frontiere.get(0);
            }
        }






    public ArrayList<Taquin> getSolution() {
        return solution;
    }
}
