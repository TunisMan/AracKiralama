

public class Araba extends Arac
{

    private boolean sunroof;

    public Araba(String marka, String model, int yil, double kiralamaUcreti, boolean sunroof)
    {

        super(marka, model, yil, kiralamaUcreti);
        this.sunroof = sunroof;

    }

    @Override
    public void aracBilgisiGoster()
    {

        super.aracBilgisiGoster();
        System.out.println("Sunroof: " + (sunroof ? "Var" : "Yok"));

    }
}