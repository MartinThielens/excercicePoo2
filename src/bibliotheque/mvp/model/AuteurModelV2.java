package bibliotheque.mvp.model;

import bibliotheque.metier.*;

import java.util.ArrayList;
import java.util.List;

public class AuteurModelV2 implements DAO<Auteur>,SpecialAuteur{
    private List<Auteur> adatas = new ArrayList<>();
    @Override
    public Auteur add(Auteur auteur) {
        if (adatas.contains(auteur)) return null;
        adatas.add(auteur);
        return auteur;
    }

    @Override
    public boolean remove(Auteur auteur) {
        return adatas.remove(auteur);
    }

    @Override
    public Auteur update(Auteur auteur) {
        int p = adatas.indexOf(auteur);
        if (p < 0) return null;
        adatas.set(p, auteur);
        return auteur;
    }

    @Override
    public Auteur read(Auteur rech) {
        int p = adatas.indexOf(rech);
        if(p<0) return null;
        return adatas.get(p);
    }

    @Override
    public List<Auteur> getAll() {
        return adatas;
    }

    @Override
    public List<Ouvrage> listerOuvrages(Auteur a) {
        return a.listerOuvrages();
    }

    @Override
    public List<Livre> listerLivre(Auteur a, TypeLivre tl) {
        return a.listerLivres(tl);
    }

    @Override
    public List<Ouvrage> listerOuvrages(Auteur a, String genre) {
        return a.listerOuvrages();
    }
}
