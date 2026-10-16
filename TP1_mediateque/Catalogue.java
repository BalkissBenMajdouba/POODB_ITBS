
package TP1_mediateque;

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
        documents.add(document);
    }

    public Optional<T> rechercherParTitre(String titre) {
        return documents.stream()
                .filter(d -> d.getTitre().equalsIgnoreCase(titre))
                .findFirst();
    }
    public void afficherTout() {
        Collections.sort(documents);

        if (documents.isEmpty()) {
            System.out.println("Le catalogue est vide.");
            return;
        }

        for (T document : documents) {
            System.out.println(document.descriptionCourte());
        }
    }

    public int getNombreDocuments() {
        return documents.size();
    }
}
