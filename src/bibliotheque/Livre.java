package bibliotheque;

import java.util.Objects;

public class Livre extends Ouvrage{
    private String isbn;
    private int nbrePages;
    private TypeLivre tl;
    private String resume;


    public Livre(String titre, int ageMin, String dateParution, double prixLocation, String langue, String genre,String isbn,int nbrePages,TypeLivre tl,String resume) {
        super(titre, ageMin, dateParution, TypeOuvrage.LIVRE, prixLocation, langue, genre);
        this.isbn=isbn;
        this.nbrePages=nbrePages;
        this.tl=tl;
        this.resume=resume;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNbrePages() {
        return nbrePages;
    }

    public void setNbrePages(int nbrePages) {
        this.nbrePages = nbrePages;
    }

    public TypeLivre getTl() {
        return tl;
    }

    public void setTl(TypeLivre tl) {
        this.tl = tl;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public void addAuteur(Auteur a1, Livre l1){
        a1.getLouvrage().add(l1);
        l1.getLauteurs().add(a1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livre livre = (Livre) o;
        return Objects.equals(isbn, livre.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return super.toString()+ "Livre{" +
                "isbn='" + isbn + '\'' +
                ", nbrePages=" + nbrePages +
                ", tl=" + tl +
                ", resume='" + resume + '\'' +
                "} " + super.toString();
    }
}
