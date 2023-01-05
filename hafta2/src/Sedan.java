public class Sedan extends Araba{

    protected int aylikKira;

    public Sedan(String marka ,int fiyat,int kiraGunu,int aylikKira){
        super(marka,fiyat,kiraGunu);
        this.aylikKira=aylikKira;

    }

    @Override
    public double ucret(){
        double ucret = super.ucret() * aylikKira;
        return  ucret;
    }

}
