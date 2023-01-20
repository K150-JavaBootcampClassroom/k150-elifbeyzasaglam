package Bilet;

public class THYBiletHesapla implements  biletHesapla{


    @Override
    public void hesaplaEkonomi(double yolculukSuresi , double yolculukMesafesi){
        double fiyat = (yolculukSuresi*0.1 + yolculukMesafesi*0.2 )  * 100;

    }

    @Override
    public void hesaplaBusiness(double yolculukSuresi , double yolculukMesafesi) {
        double fiyat = (yolculukSuresi*0.1 + yolculukMesafesi*0.2 )  * 100  + 100;

    }
    yemekHesapla yemek = new yemekHesapla();
    boolean sonuc = yemek.yemekVarMi();

}
