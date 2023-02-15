package bibliotheque;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Gestion {
    public static void main(String[] args) {
        Auteur a1 = new Auteur("Jhon","doe","be");
        Livre l1 = new Livre("le villain petit canard",3,"18/12/01", 1.35, "fr", "compte","3456654345",35,TypeLivre.ROMAN,"le livre du petit canard");
        //a1.getLouvrage().add(l1);
        //l1.getLauteurs().add(a1);
        a1.addLivre(a1,l1);
        Rayon r1 = new Rayon("34b", "Comptine");
        Exemplaire e1 = new Exemplaire("1213HE19", "Parfait état",l1);
        //e1.setRayon(r1);
        //r1.getLex().add(e1);
        e1.addRayon(e1,r1);
        Lecteur lec = new Lecteur(1,"Bob","Mc_Bob", LocalDate.of(2023,2,15),"39 rue des poires molles Tinttuin", "Bob@gmail.com","0475/99/78/35");
        Location loc = new Location(LocalDate.of(2023,2,15),LocalDate.of(2023,2,23),lec,e1);
        //lec.getLloc().add(loc);
        //e1.getLloc().add(loc);
        lec.addLecteurToLocation(e1,lec,loc);
        System.out.println(a1);
        System.out.println(l1);
        System.out.println(r1);
        System.out.println(e1);
        System.out.println(lec);
    }
}
