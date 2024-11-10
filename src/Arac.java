
public class Arac
    {

        private String marka;
        private String model;
        private int yil;
        private double kiralamaUcreti;


        public Arac(String marka, String model, int yil, double kiralamaUcreti)
        {

            this.marka = marka;
            this.model = model;
            this.yil = yil;
            this.kiralamaUcreti = kiralamaUcreti;

        }


        public void aracBilgisiGoster()
        {

            System.out.println("Marka: " + marka);
            System.out.println("Model: " + model);
            System.out.println("Yıl: " + yil);
            System.out.println("Kiralama ücreti: " + kiralamaUcreti + " TL/Gün");
        }

        public double getKiralamaUcreti()
        {
            return kiralamaUcreti;
        }
    }
