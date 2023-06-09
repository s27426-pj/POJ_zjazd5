package Zadanie1;
import java.time.Instant;
import java.util.ArrayList;
public class Zadanie1 {
    public static void main(String[] args) {
        String a;
        Czas Czas = new Czas();
        Instant instant = Czas.getInstant();
        System.out.println("Czas rozpoczęcia operacji: " + Czas.getInstant());
        ArrayList<Integer> liczby = new ArrayList<Integer>();
        for (int i = 1;i<51;i++){
            liczby.add(i*2);
        }
        for (int i = 0;i<50;i++){
            System.out.println(i + ": " + liczby.get(i));
        }
        System.out.println("Czas zakończenia operacji :" + Czas.getInstant());
    }

}
class Czas {
    private Instant instant = Instant.now();
    public Instant getInstant() {
        return instant;
    }
}