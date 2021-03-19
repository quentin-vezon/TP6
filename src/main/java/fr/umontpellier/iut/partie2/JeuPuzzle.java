package fr.umontpellier.iut.partie2;

import java.util.ArrayList;

public interface JeuPuzzle {
    public ArrayList<JeuPuzzle> genererFils();
    public boolean estGagnant();

}
