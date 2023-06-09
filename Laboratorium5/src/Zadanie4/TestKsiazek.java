package Zadanie4;

import java.util.ArrayList;
import java.util.Arrays;

public class TestKsiazek {
    public static void main(String[] args) {
        KsiazkaPapierowa P1 = new KsiazkaPapierowa();
        KsiazkaPapierowa P2 = new KsiazkaPapierowa("Czysty kod","Robert C. Martin",424,2010);
        Ebook E1 = new Ebook();
        Ebook E2 = new Ebook("Opowieści z Narnii: Lew, czarownica i stara szafa","C.S.Lewis",184,52);
        String arr[] = {P1.toString(),P2.toString(),E1.toString(),E2.toString()};
        Arrays.sort(arr);
        for (String i : arr) {
            System.out.println(i);
        }
    }
}
