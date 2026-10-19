package examantp6;

import java.util.Scanner;

public class Film {
	protected String titre;
    protected String realisateur;
    protected String pays;
    protected int duree;
    protected int nbPlaces;
    public Film(String titre, String r, String pays, int d) {
        this.titre = titre;
        this.realisateur = r;
        this.pays = pays;
        this.duree = d;
        this.nbPlaces = 0;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public String toString() {
        return titre + " de " + realisateur + " (" + pays
                + ") - " + duree + "min.";
    }

    public float totalVenteBillets() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre de billets etudiants : ");
        int nbEtudiants = sc.nextInt();

        while (nbEtudiants > nbPlaces || nbEtudiants < 0) {
            System.out.print("Nombre invalide, ressaisir : ");
            nbEtudiants = sc.nextInt();
        }

        int nbPublic = nbPlaces - nbEtudiants;

        return nbEtudiants * 2 + nbPublic * 3;
    }
}
