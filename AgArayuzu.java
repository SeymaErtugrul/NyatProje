import java.sql.SQLException;
import java.util.Scanner;

public class AgArayuzu
{
    public static void main(String[] args) throws SQLException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        String kullaniciadi = null, sifre = null;
        VeriTabani veritabani = new VeriTabani();
        IEyleyici soğutucu=new Soğutucu.Builder().sesmodu("sessiz").build();
        boolean acikmi=soğutucu.sogutucuacıkmı();
        IMerkeziİslemBirimi sicaklikalgilayici = new SıcaklıkAlgılayıcı();
        int anliksicaklik=  sicaklikalgilayici.sıcaklikdondur();


        do
        {
            System.out.println("Kullanici adinizi ve şifrenizi giriniz");
            System.out.println("Kullanici adi: ");
            kullaniciadi = scan.nextLine();
            System.out.println("Sifre: ");
            sifre = scan.nextLine();
        }
        while(!veritabani.girisYap(kullaniciadi,sifre));


            int secim;
            do {
                int sicakliksayac=0;
                Scanner reader = new Scanner(System.in);
                System.out.println("Kullanici Dogrulandi");
                if (sicakliksayac==0) {
                    IEyleyici zorunlu = new Zorunlu((SıcaklıkAlgılayıcı) sicaklikalgilayici);
                }
                System.out.println("Sogutucuyu acmak için 1'e basınız");
                System.out.println("Sogutucuyu kapatmak için 2'ye basınız");
                System.out.println("Sıcaklığı görüntülemek için 3'e basınız");
                System.out.println("Çıkıs yapmak için 4'e basınız");
                System.out.print("Secim:");
                secim = reader.nextInt();
                sicakliksayac++;

                switch (secim) {
                    case 1:
                        if (!acikmi)
                        {
                            System.out.println("İsteğiniz iletiliyor...");
                            Thread.sleep(400);
                            System.out.println("Soğutucu açılıyor...");
                            Thread.sleep(400);
                            System.out.println("Soğutucu açıldı...");
                            Thread.sleep(400);
                            acikmi=true;
                        }
                        else
                        {
                            System.out.println("İsteğiniz iletiliyor...");
                            Thread.sleep(400);
                            System.out.println("Soğutucu çalışır vaziyette...");
                            Thread.sleep(400);
                        }

                        break;
                    case 2:
                        System.out.println("İsteğiniz iletiliyor...");
                        Thread.sleep(400);
                        if (acikmi)
                        {
                            System.out.println("Soğutucu Kapatılıyor...");
                            Thread.sleep(400);
                            System.out.println("Soğutucu Kapatıldı");
                            acikmi=false;
                        }

                        else
                        {

                            System.out.println("Soğutucu kapalı vaziyette...");
                            Thread.sleep(400);
                        }

                        break;
                    case 3:

                        System.out.println("İsteğiniz iletiliyor...");
                        Thread.sleep(400);
                        System.out.println("Sicaklik Algilaniyor...");
                        Thread.sleep(400);
                        System.out.println("Anlik sicaklik: "+ anliksicaklik + " derece ");
                        Thread.sleep(400);


                        break;
                    case 4:
                        System.out.println("İYİ GÜNLER DİLERİZ... :)");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Yanlis tercih!");
                        break;
                }
            } while (secim != 4);
        }
}


