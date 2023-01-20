public class Meyveler extends Hal{
    private String name ;
    private static float price ;
    private static float kg;

    public Meyveler(float kg) {

    }
     public void hesapla(float kg){
        price = Meyveler.price * this.kg  ;
     }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public float getPrice()
    {
        return this.price;
    }

    public void setPrice(String price)
    {
        this.price = Float.parseFloat(price);
    }

    public float getKg()
    {
        return this.kg;
    }

    public void setTotal(String kg)
    {
        this.kg = Float.parseFloat(kg);
    }

}
