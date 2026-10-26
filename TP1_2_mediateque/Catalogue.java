package TP1_2_mediateque;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Catalogue<T extends Document> {

    private List<T> documents;

    public Catalogue() {
        documents = new ArrayList<>();
    }

    public void ajouter(T document) {
        if (document == null) {
            throw new IllegalArgumentException(
                    "Impossible d'ajouter un document null.");
        }
        for (T d : documents) {
            if (d.getIdentifiant() == document.getIdentifiant()) {
                throw new IllegalArgumentException(
                        "Un document avec l'identifiant "
                                + document.getIdentifiant() + " existe déjà.");
            }
        }
        documents.add(document);
    }

    public Optional<T> rechercherParTitre(String titre) {
        if (titre == null || titre.trim().isEmpty()) {
            return Optional.empty();
        }
        return documents.stream()
                .filter(d -> d.getTitre().equalsIgnoreCase(titre.trim()))
                .findFirst();
    }

    public void afficherTout() {
        if (documents.isEmpty()) {
            System.out.println("Le catalogue est vide.");
            return;
        }

        Collections.sort(documents);

        for (T document : documents) {
            System.out.println(document.descriptionCourte());
        }
    }

    public int getNombreDocuments() {
        return documents.size();
    }
}