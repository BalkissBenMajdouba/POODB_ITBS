package TP1_mediateque;

public abstract class Document implements Comparable<Document> {

    private int id;
    private String titre;
    private int annee;

    public Document(int id, String titre, int annee) {
        this.id = id;
        this.titre = titre;
        this.annee = annee;
    }

    public int getIdentifiant() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public int getAnnee() {
        return annee;
    }

    public abstract String descriptionCourte();

    @Override
    public int compareTo(Document autre) {
        return this.titre.compareToIgnoreCase(autre.titre);
    }

    @Override
    public String toString() {
        return "ID : " + id
                + ", Titre : " + titre
                + ", Année : " + annee;
    }
}
