package examantp6;

public class Jcc {
	 private Film[] competition;
	    private int annee;
	    public static final int NBFMAX = 30;
	    private int nbF = 0;

	    public Jcc(int taille, int annee) {
	        if (taille > NBFMAX) {
	            taille = NBFMAX;
	        }

	        competition = new Film[taille];
	        this.annee = annee;
	    }

	    public void ajoutFilm(Film f) {
	        if (nbF < competition.length) {
	            competition[nbF] = f;
	            nbF++;
	        } else {
	            System.out.println("La compétition est au complet");
	        }
	    }

	    public void listeFilmsJCC() {
	        for (int i = 0; i < nbF; i++) {
	            System.out.println(competition[i]);
	        }
	    }

	    public float totalVenteBilletsJCC() {
	        float total = 0;

	        for (int i = 0; i < nbF; i++) {
	            total = total + competition[i].totalVenteBillets();
	        }

	        return total;
	    }

	    public static void main(String[] args) {
	        Jcc j = new Jcc(30, 2021);

	        Documentaire f1 = new Documentaire(
	                "Le dernier refuge", "Ousman",
	                "Mali", 86, "La guerre civile");

	        f1.setNbPlaces(30);

	        Film f2 = new Film(
	                "Insurrection", "Jilani Saadi",
	                "Tunisie", 105);

	        f2.setNbPlaces(45);

	        j.ajoutFilm(f1);
	        j.ajoutFilm(f2);

	        System.out.println("Films 2021:");
	        j.listeFilmsJCC();

	        System.out.println("Total des ventes : "
	                + j.totalVenteBilletsJCC() + " DT");
	    }

}
