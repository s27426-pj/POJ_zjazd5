package Zadanie4;

public class KsiazkaPapierowa extends Ksiazka{
    int rokWydania;

    public int getRokWydania() {
        return rokWydania;
    }

    @Override
    public int getLiczbaStron() {
        return super.getLiczbaStron();
    }

    @Override
    public String getAutor() {
        return super.getAutor();
    }

    @Override
    public String getTytul() {
        return super.getTytul();
    }

    @Override
    public void setAutor(String autor) {
        super.setAutor(autor);
    }

    @Override
    public void setLiczbaStron(int liczbaStron) {
        super.setLiczbaStron(liczbaStron);
    }

    @Override
    public void setTytul(String tytul) {
        super.setTytul(tytul);
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }
    public KsiazkaPapierowa(String tytul,String autor,int liczbaStron,int rokWydania){
        super(tytul,autor,liczbaStron);
        this.rokWydania = rokWydania;
    }
    public KsiazkaPapierowa(){
        tytul = "Makbet";
        autor = "William Shakespeare";
        liczbaStron = 152;
        rokWydania = 2003;
    }

    @Override
    public String toString() {
        return "Tytuł: " + tytul + " Autor: " + autor + " Liczba stron: " + liczbaStron + " Rok wydania: " + rokWydania;
    }
}
