package Zadanie4;

public class Ebook extends Ksiazka{
    int rozmiar;
    String format;

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

    public int getRozmiar() {
        return rozmiar;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public void setLiczbaStron(int liczbaStron) {
        super.setLiczbaStron(liczbaStron);
    }

    @Override
    public void setTytul(String tytul) {
        super.setTytul(tytul);
    }

    @Override
    public void setAutor(String autor) {
        super.setAutor(autor);
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setRozmiar(int rozmiar) {
        this.rozmiar = rozmiar;
    }
    public Ebook(String tytul,String autor,int liczbaStron,int rozmiar){
        super(tytul,autor,liczbaStron);
        format = "PDF";
        this.rozmiar = rozmiar;
    }
    public Ebook(){
        tytul = "Kamienie na szaniec";
        autor = "Aleksander Kamiński";
        liczbaStron = 256;
        rozmiar = 32;
        format = "PDF";
    }

    @Override
    public String toString() {
        return "Tytuł: " + tytul + " Autor: " + autor + " Liczba stron: " + liczbaStron + " Format: " + format + " Rozmiar: " + rozmiar;
    }
}
