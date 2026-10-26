package TP1_2_mediateque;

public class DocumentIndisponibleException extends MediathequeException {

    public DocumentIndisponibleException(String title) {
        super("Le document '" + title + "' est indisponible.");
    }

    public DocumentIndisponibleException(String title, Throwable cause) {
        super("Le document '" + title + "' est indisponible.", cause);
    }
}
