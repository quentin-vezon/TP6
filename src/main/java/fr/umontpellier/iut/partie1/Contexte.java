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

        ArrayList<Couple> frontiere = new ArrayList<>();
        ArrayList<Taquin> dejaVu = new ArrayList<>();
        Couple temp = new Couple(taquinInitial, null);
        frontiere.add(temp);
        while (! frontiere.isEmpty()) {
            temp = frontiere.get(0);
            temp.mettreAJour(frontiere, dejaVu);
            if (temp.getTaquin().estGagnant()) {
                solution = temp.getListeDeMouvements();

                break;
            }
            frontiere.remove(temp);
            }
        }



    public ArrayList<Taquin> getSolution() {
        return solution;
    }

    @Override
    public String toString() {

        String chaine = "La solution est :\n";
        if (solution == null || solution.isEmpty()) {
            chaine += "Il n'y a pas de solution.\n";
        } else {
            for (Taquin objet : solution) {
                chaine += objet.toString() + "\n";
            }
        }
        return chaine;
    }
}