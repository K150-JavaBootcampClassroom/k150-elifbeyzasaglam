package Bilet;

public class PegasusBiletHesapla implements biletHesapla{


    @Override
    public void hesaplaEkonomi(double yolculukSuresi, double yolculukMesafesi) {
        double fiyat = (yolculukSuresi*0.2 + yolculukMesafesi*0.3 )  * 150;
    }

    @Override
    public void hesaplaBusiness(double yolculukSuresi, double yolculukMesafesi) {
        double fiyat = (yolculukSuresi*0.2 + yolculukMesafesi*0.3 )  * 150  + 100;
    }

    yemekHesapla yemek = new yemekHesapla();
    boolean sonuc = yemek.yemekVarMi();




}
