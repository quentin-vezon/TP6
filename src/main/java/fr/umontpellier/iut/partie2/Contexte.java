package fr.umontpellier.iut.partie2;

import java.util.ArrayList;

public class Contexte {

    private JeuPuzzle taquinInitial;
    private ArrayList<JeuPuzzle> solution;

    public Contexte(JeuPuzzle taquinInitial) {
        this.taquinInitial = taquinInitial;
        solution = new ArrayList<>();

    }

    public void resoudre() {

        ArrayList<Couple> frontiere = new ArrayList<>();
        ArrayList<JeuPuzzle> dejaVu = new ArrayList<>();
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



    public ArrayList<JeuPuzzle> getSolution() {
        return solution;
    }

    @Override
    public String toString() {

        String chaine = "La solution est :\n";
        if (solution == null || solution.isEmpty()) {
            chaine += "Il n'y a pas de solution.\n";
        } else {
            for (JeuPuzzle objet : solution) {
                chaine += objet.toString() + "\n";
            }
        }
        return chaine;
    }
}