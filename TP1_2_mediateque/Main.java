package TP1_2_mediateque;

import java.util.Optional;

public class Main {

        public static void main(String[] args) {

                Catalogue<Document> catalogue = new Catalogue<>();

                Livre livre = new Livre(1, "Les Miserables", 1862,
                                "Victor Hugo", 1500);

                Dvd dvd = new Dvd(2, "Inception", 2010, 148);

                Revue revue = new Revue(
                                3, "Science et Vie", 2025, 1250);

                catalogue.ajouter(livre);
                catalogue.ajouter(dvd);
                catalogue.ajouter(revue);

                System.out.println("=== Catalogue ===");
                catalogue.afficherTout();

                System.out.println("\n=== Recherche ===");

                Optional<Document> resultat = catalogue.rechercherParTitre("inception");

                if (resultat.isPresent()) {
                        System.out.println(resultat.get());
                } else {
                        System.out.println("Document introuvable.");
                }
                System.out.println("\n=== Emprunts ===");

                try {
                        livre.emprunter();
                        livre.emprunter();
                } catch (DocumentIndisponibleException e) {
                        System.out.println("Erreur : " + e.getMessage());
                }

                livre.rendre();

                try {
                        livre.emprunter();
                        dvd.emprunter();
                } catch (DocumentIndisponibleException e) {
                        System.out.println("Erreur : " + e.getMessage());
                }

                System.out.println(
                                "Livre disponible : " + livre.estDisponible());

                System.out.println(
                                "DVD disponible : " + dvd.estDisponible());

                // Nombre de documents
                System.out.println(
                                "Nombre de documents : "
                                                + catalogue.getNombreDocuments());

                System.out.println("\n=== Cas invalides ===");

                try {
                        catalogue.ajouter(null);
                } catch (IllegalArgumentException e) {
                        System.out.println("Erreur : " + e.getMessage());
                }

                System.out.println("\n=== Bibliothécaire ===");

                Bibliothecaire bibliothecaire = new Bibliothecaire("Sami", catalogue);
                bibliothecaire.accueillir();

                Optional<Document> trouve = bibliothecaire.rechercher("science et vie");
                System.out.println(trouve.isPresent() ? trouve.get() : "Document introuvable.");

                bibliothecaire.afficherCatalogue();

        }
}