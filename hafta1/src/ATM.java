import java.util.Scanner;
public class ATM {
    public static void main(String[]args) {
    Scanner giris = new Scanner(System.in);

       double bakiye = 10_000;
        System.out.println("para çekmek için 0 , para yatırma için 1 , bekiye öğrenme için 2 , çıkış için 3 tuşlayınız.");
        int sayı = giris.nextInt();

        switch(sayı) {
            case 0: System.out.println("Çekmek istediğiniz miktarı girin:");
                double cekilen = giris.nextDouble();
                bakiye -= cekilen;
                System.out.println("kalan bakiyeniz :" + bakiye);
                if (bakiye< 0) {
                    System.out.println("Limit yetersiz!");
                }
                break;

            case 1:
              System.out.println( "yatırmak istediğiniz miktarı giriniz:");
              double yatırılan = giris.nextDouble();
              bakiye += yatırılan;
              System.out.println("Yeni bakiyeniz: " + bakiye);
              break;
            case 2:
             System.out.println("Bakiyeniz:" + bakiye );
             break;
            case 3:
              System.out.println("Sistemden çıkıyorsunuz. İyi günler :)");
              break;



        }
    }
}
