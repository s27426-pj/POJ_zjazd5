package Zadanie4;

public class Ksiazka {
    protected String tytul;
    protected String autor;
    protected int liczbaStron;

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public String getAutor() {
        return autor;
    }

    public String getTytul() {
        return tytul;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }
    public Ksiazka(String tytul,String autor,int liczbaStron){
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
    }
    public Ksiazka(){
        tytul = "Dziady cz.2";
        autor = "Adam Mickiewicz";
        liczbaStron = 48;
    }
}
