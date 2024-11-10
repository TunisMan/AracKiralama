

public class Motorsiklet extends Arac

{
    private boolean kaskDahil;


    public Motorsiklet(String marka, String model, int yil, double kiralamaUcreti, boolean kaskDahil)
    {

        super(marka, model, yil, kiralamaUcreti);
        this.kaskDahil = kaskDahil;

    }

    @Override
    public void aracBilgisiGoster()
    {

        super.aracBilgisiGoster();
        System.out.println("Kask Dahil: " + (kaskDahil ? "Evet" : "Hayır"));

    }
}