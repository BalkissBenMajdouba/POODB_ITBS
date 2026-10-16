package TP1_mediateque;

public class Livre extends Document implements Empruntable {
    private String auteur;
    private int nombrePages;
    private boolean disponible;

    public Livre(int id, String titre, int annee,
            String auteur, int nombrePages) {
        super(id, titre, annee);
        this.auteur = auteur;
        this.nombrePages = nombrePages;
        this.disponible = true;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    @Override
    public void emprunter() {
        if (disponible) {
            disponible = false;
            System.out.println("Livre emprunté : " + getTitre());
        } else {
            System.out.println("Ce livre est déjà emprunté.");
        }
    }

    @Override
    public void rendre() {
        if (!disponible) {
            disponible = true;
            System.out.println("Livre rendu : " + getTitre());
        } else {
            System.out.println("Ce livre est déjà disponible.");
        }
    }

    @Override
    public boolean estDisponible() {
        return disponible;
    }

    @Override
    public String descriptionCourte() {
        return "Livre : " + getTitre()
                + " | Auteur : " + auteur
                + " | Pages : " + nombrePages;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Auteur : " + auteur
                + ", Pages : " + nombrePages
                + ", Disponible : " + disponible;
    }
}
