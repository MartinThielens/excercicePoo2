package bibliotheque.mvp.model;

import bibliotheque.metier.Lecteur;

import java.util.List;

public interface DAOLecteur {
    Lecteur addLecteur(Lecteur lec);

    boolean removeLecteur(Lecteur lec);

    Lecteur updateLecteur(Lecteur lecteur);

    List<Lecteur> getLecteurs();
}
