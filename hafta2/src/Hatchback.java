public class Hatchback extends Araba {


    public Hatchback(String marka, int fiyat, int kiraGunu) {
        super(marka, fiyat,kiraGunu );
    }
    @Override
    public double ucret() {
        super.ucret();
        return ucret();
    }
}