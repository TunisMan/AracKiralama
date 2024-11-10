

public class Minibus extends Arac
    {

        private int yolcuKapasitesi;

        public Minibus(String marka, String model, int yil, double kiralamaUcreti, int yolcuKapasitesi)
        {

            super(marka, model, yil, kiralamaUcreti);
            this.yolcuKapasitesi = yolcuKapasitesi;

        }

        @Override
        public void aracBilgisiGoster()
        {

            super.aracBilgisiGoster();
            System.out.println("Yolcu kapasitesi: " + yolcuKapasitesi);
        }

    }
