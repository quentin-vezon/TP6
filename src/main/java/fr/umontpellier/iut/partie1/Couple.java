package fr.umontpellier.iut.partie1;

import java.util.ArrayList;

public class Couple {

    private Taquin taquin;
    private Couple predecesseur;

    public Couple(Taquin taquin, Couple predecesseur) {
        this.taquin = taquin;
        this.predecesseur = predecesseur;
    }

    public void mettreAJour(ArrayList<Couple> frontiere, ArrayList<Taquin> dejaVus) {
        ArrayList<Taquin> t = this.taquin.genererFils();
        for(int i=0; i < t.size(); i++){
            if(dejaVus.contains(t.get(i))){
                dejaVus.add(t.get(i));
                frontiere.add(new Couple(t.get(i), this));
            }
        }
    }

    public ArrayList<Taquin> getListeDeMouvements() {

        ArrayList<Taquin> List = new ArrayList<>();
        Couple temp = this;
        while(temp.predecesseur != null){
            List.add(0,temp.taquin);
            temp = temp.predecesseur;
        }
        List.add(0,temp.taquin);
       return(List);

    }

    public Taquin getTaquin() {
        return taquin;
    }
}
