import java.util.Random;
public class RandomOdev {
    public static void main(String [] args){
        Random rastgele = new Random();

        int sayac=0;
        while (true){
            int rastgeleSayi = rastgele.nextInt(500);
            sayac++;

            if (50<rastgeleSayi  && rastgeleSayi<100){

                System.out.println(rastgeleSayi + " sayısını " +
                        +sayac+  " defada buldu  ");
                break;
            }
        }
    }
}
