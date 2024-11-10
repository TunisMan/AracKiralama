import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class AracKiralamaUygulamasi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean devamEt = true;

        //Farklı araç türlerini oluşturur
        Arac araba = new Araba("Toyota", "Corolla", 2020, 500, true);
        Arac motorsiklet = new Motorsiklet("Yamaha", "MT-07", 2019, 300, true);
        Arac minibus = new Minibus("Mercedes", "Sprinter", 2021, 800, 15);

        while (devamEt) {

            System.out.println("Araç kiralama Uygulamasına Hoşgeldiniz!");
            System.out.println("Lütfen bir araç seçin:");
            System.out.println("1. Araba");
            System.out.println("2. Motorsiklet");
            System.out.println("3. Minibüs");
            System.out.println("4. Çıkış");

            System.out.print("Seçim: ");
            int secim = scanner.nextInt();

            if (secim == 4) {

                devamEt = false;
                System.out.println("Sistemden çıkılıyor, iyi günler'");
                break;

            }

            Arac secilenArac = null;
            switch (secim) {

                case 1:
                    secilenArac = araba;
                break;

                case 2:
                    secilenArac = motorsiklet;
                    break;

                case 3:
                    secilenArac = minibus;
                    break;

                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyiniz.");
                    continue;
            }

            //Seçilen aracın bilgilerini göster

            if (secilenArac != null) {


                secilenArac.aracBilgisiGoster();

                //Kiralama süresini al
                System.out.println("Kaç gün boyunca kiralamak istiyorsunuz?");
                System.out.print("Gün Sayısı: ");
                int gunSayisi = scanner.nextInt();

                if (gunSayisi <= 0) {

                    System.out.println("Geçersiz gün sayısı! Lütfen tekrardan girin.");
                    continue;
                }

                //Toplam ücreti hesapla ve göster.
                double toplamUcret = secilenArac.getKiralamaUcreti() * gunSayisi;
                System.out.println("Toplam ücret: " + toplamUcret + "TL");
            }


        }

    }


}