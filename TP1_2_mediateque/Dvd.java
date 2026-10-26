
package TP1_2_mediateque;

public class Dvd extends Document implements Empruntable {

    private int dureeMinutes;
    private boolean disponible;

    public Dvd(int id, String titre, int annee, int dureeMinutes) {
        super(id, titre, annee);
        this.dureeMinutes = dureeMinutes;
        this.disponible = true;
    }

    // Getter
    public int getDureeMinutes() {
        return dureeMinutes;
    }

    @Override
    public void emprunter() throws DocumentIndisponibleException {
        if (!disponible) {

            throw new DocumentIndisponibleException(getTitre());
        } else {
            disponible = false;
            System.out.println("DVD emprunté : " + getTitre());
        }
    }

    @Override
    public void rendre() {
        if (!disponible) {
            disponible = true;
            System.out.println("DVD rendu : " + getTitre());
        } else {
            System.out.println("Ce DVD est déjà disponible.");
        }
    }

    @Override
    public boolean estDisponible() {
        return disponible;
    }

    @Override
    public String descriptionCourte() {
        return "DVD : " + getTitre()
                + " | Année : " + getAnnee()
                + " | Durée : " + dureeMinutes + " minutes";
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Durée : " + dureeMinutes + " minutes"
                + ", Disponible : " + disponible;
    }
}
