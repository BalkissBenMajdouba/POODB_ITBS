
package TP1_mediateque;

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

      
        catalogue.afficherTout();


        Optional<Document> resultat = catalogue.rechercherParTitre("inception");

        if (resultat.isPresent()) {
            System.out.println(resultat.get());
        } else {
            System.out.println("Document introuvable.");
        }


        livre.emprunter();
        livre.emprunter();
        livre.rendre();
        livre.emprunter();

        dvd.emprunter();

        System.out.println(
                "Livre disponible : " + livre.estDisponible());

        System.out.println(
                "DVD disponible : " + dvd.estDisponible());

        System.out.println(
                "Nombre de documents : "
                        + catalogue.getNombreDocuments());
    }
}
