public class SUV extends Araba{
    protected int yas;

    public SUV (String marka ,int fiyat, int kiraGunu, int yas){
       super(marka,fiyat,kiraGunu);
       this.yas=yas;
    }

    @Override
    public double ucret(){
        double ucret = yas * super.ucret();
        return ucret;
    }
}
