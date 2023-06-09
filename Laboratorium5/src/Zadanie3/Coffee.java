package Zadanie3;
import java.util.ArrayList;
import java.util.Iterator;
public class Coffee {
    public static void main(String[] args) {
        ArrayList<String> kawa = new ArrayList<String>();
        kawa.add("espresso");
        kawa.add("latte");
        kawa.add("cappuccino");
        kawa.add("mocha");
        kawa.add("auLait");
        kawa.add("macchiato");
        System.out.println(kawa);
        Iterator<String> ite = kawa.iterator();
        while(ite.hasNext()) {
            System.out.println(ite.next());
        }
        for (String i : kawa) {
            System.out.println(i.toUpperCase());
        }
        for (int i = 0;i<5;i++){
            String a;
            a = kawa.get(i);
            System.out.println(a.substring(0,4));
        }
    }
}
