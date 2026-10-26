package TP1_2_mediateque;

import java.util.Optional;

public class Bibliothecaire {
    private final String nom;
    private final Catalogue<Document> catalogue;

    public Bibliothecaire(String nom, Catalogue<Document> catalogue) {
        if (nom == null || nom.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Le nom du bibliothécaire ne peut pas être null ou vide.");
        }
        if (catalogue == null) {
            throw new IllegalArgumentException(
                    "Le catalogue ne peut pas être null.");
        }
        this.nom = nom.trim();
        this.catalogue = catalogue;
    }

    public String getNom() {
        return nom;
    }

    public void accueillir() {
        System.out.println("Bonjour, je suis " + nom);
    }

    public void enregistrer(Document document) {
        catalogue.ajouter(document);
    }

    public Optional<Document> rechercher(String titre) {
        return catalogue.rechercherParTitre(titre);
    }

    public void afficherCatalogue() {
        catalogue.afficherTout();
    }
}