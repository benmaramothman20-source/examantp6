package examantp6;

public class Documentaire extends Film{
	private String sujet;
    private static float tarif = 2;

    public Documentaire(String titre, String r, String pays,int d, String sujet) {
        super(titre, r, pays, d);
        this.sujet = sujet;
    }

    public String toString() {
        return super.toString() + " Sujet : " + sujet;
    }

    public float totalVenteBillets() {
        return nbPlaces * tarif;
    }

}
