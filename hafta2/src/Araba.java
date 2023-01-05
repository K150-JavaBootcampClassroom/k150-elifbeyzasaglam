public class Araba {

private String model;
private String renk;
private int kapasite;
private int fiyat;
private String marka;

private int kiraGunu;

public Araba(String marka ,int fiyat, int kiraGunu) {
    this.marka=marka;
    this.fiyat=fiyat;
    //this.kiraGunu=kiraGunu;

}

public double ucret() {
    double ucret  = kiraGunu * 100;
    return  ucret;
}

public String getModel(){
    return model;
}
public void setModel(String model ){
    this.model=model;
}
public String getRenk(){
    return renk;
}
public void setRenk(String renk){
    this.renk=renk;
}
public int getKapasite(){
    return kapasite;
}
public void setKapasite(int kapasite){
    this.kapasite=kapasite;
}
    public int getFiyat(){
        return fiyat;
    }
    public void setFiyat(int fiyat){
        this.fiyat=fiyat;
    }
    public String getMarka(){
        return marka;
    }
    public void setMarka(String marka){
        this.marka=marka;
    }
    public int getKiraGunu(){
        return kiraGunu;
    }
    public void setKiraGunu(int kiraGunu){
        this.kiraGunu=kiraGunu;
    }
}

