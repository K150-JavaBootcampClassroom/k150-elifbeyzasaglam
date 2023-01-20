package Bilet;

public class yemekHesapla extends Bilet{
    public boolean yemekVarMi(){
        if(yurtIciMi){
            if(ucusFirması.equals("Pegasus")){
                System.out.println("Yemek yok!");
            }else {
                System.out.println("Yemek var ");
            }
        }
        else{
            System.out.println("Yemek var");
        }
        return false;
    }
}
