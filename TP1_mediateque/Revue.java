package TP1_mediateque;

public class Revue extends Document {

    private int numero;

    public Revue(int id, String titre, int annee,
            int numero) {
        super(id, titre, annee);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String descriptionCourte() {
        return "Revue : " + getTitre()
                + "  Numéro : " + numero
                + "  Consultation sur place uniquement";
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Numéro : " + numero
                + ", Consultation sur place";
    }
}
