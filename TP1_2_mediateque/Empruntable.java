
package TP1_2_mediateque;

public interface Empruntable {

    void emprunter() throws DocumentIndisponibleException ;

    void rendre();

    boolean estDisponible();
}
