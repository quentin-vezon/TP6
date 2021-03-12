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
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }

    public ArrayList<Taquin> getListeDeMouvements() {

        ArrayList<Taquin> List = new ArrayList<>();
        Couple temp = this;
        while(temp.predecesseur != null){
            List.add(0,temp.taquin);
        }
       return(List);

    }

    public Taquin getTaquin() {
        return taquin;
    }
}
