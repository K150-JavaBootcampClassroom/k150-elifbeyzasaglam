import java.util.*;
import java.util.Scanner;

public class ManavDukkani {


    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Hangi meyveden alacaksınız:");
         String secilenMeyve;
        secilenMeyve = giris.nextLine();



        List<Meyveler> meyve = new ArrayList<Meyveler>();
        meyve.add(new Elma(5));
        meyve.add(new Armut(6));
        meyve.add(new Kiraz(4));


        for (Meyveler fruit : meyve) {
            fruit.hesapla(6);
        }


    }
}