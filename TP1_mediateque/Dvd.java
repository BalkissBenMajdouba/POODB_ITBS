
package TP1_mediateque;

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
    public void emprunter() {
        if (disponible) {
            disponible = false;
            System.out.println("DVD emprunté : " + getTitre());
        } else {
            System.out.println("Ce DVD est déjà emprunté.");
        }
    }

    // Rendre le DVD
    @Override
    public void rendre() {
        if (!disponible) {
            disponible = true;
            System.out.println("DVD rendu : " + getTitre());
        } else {
            System.out.println("Ce DVD est déjà disponible.");
        }
    }

    // Vérifier la disponibilité
    @Override
    public boolean estDisponible() {
        return disponible;
    }

    // Description courte
    @Override
    public String descriptionCourte() {
        return "DVD : " + getTitre()
                + " | Année : " + getAnnee()
                + " | Durée : " + dureeMinutes + " minutes";
    }

    // Affichage du DVD
    @Override
    public String toString() {
        return super.toString()
                + ", Durée : " + dureeMinutes + " minutes"
                + ", Disponible : " + disponible;
    }
}
