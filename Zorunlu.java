public class Zorunlu implements IObserver , IEyleyici
{

     int ansicaklik;
    Zorunlu(SıcaklıkAlgılayıcı sicaklik) throws InterruptedException {
        ansicaklik=sicaklik.anliksicaklik;
        this.update(sicaklik);
    }
    @Override
    public void update(Observable observable) throws InterruptedException
    {
           if (ansicaklik>=40)sogutucuac();

    }

    @Override
    public void sogutucuac() throws InterruptedException
    {
        System.out.println("SICAKLIK " + ansicaklik + "DERECE!!!");
        Thread.sleep(400);
        System.out.println("SICAKLIK KRİTİK DÜZEYDE SOĞUTUCU MECBURİ ÇALIŞTIRILIYOR!");
        while (ansicaklik>=20)
        {
           ansicaklik--;
            System.out.println("Sıcaklik: "+ ansicaklik);
            Thread.sleep(500);

        }
    }

    @Override
    public void sogutucukapat() throws InterruptedException {

    }

    @Override
    public boolean sogutucuacıkmı()
    {
        return false;
    }

}
