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
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }

    public ArrayList<Taquin> getSolution() {
        return solution;
    }
}
