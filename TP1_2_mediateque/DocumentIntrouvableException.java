package TP1_2_mediateque;

public class DocumentIntrouvableException extends MediathequeException {

    public DocumentIntrouvableException(String title) {
        super("Le document '" + title + "' est introuvable.");
    }

    public DocumentIntrouvableException(String title, Throwable cause) {
        super("Le document '" + title + "' est introuvable.", cause);
    }
}
