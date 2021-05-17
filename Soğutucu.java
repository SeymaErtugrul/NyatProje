import java.util.Random;

public class Soğutucu implements IEyleyici
{

    int sogutmahizi;
    String sesmodu;

    public Soğutucu(Builder builder)
    {
        this.sogutmahizi=builder.sogutmahizi;
        this.sesmodu=builder.sesmodu;

    }

    @Override
    public void sogutucuac() throws InterruptedException {
        System.out.println("İsteğiniz iletiliyor...");
        Thread.sleep(200);

    }

    @Override
    public void sogutucukapat() throws InterruptedException {
       System.out.println("Soğutucu Kapatılıyor...");
       Thread.sleep(400);
       System.out.println("Soğutucu kapatıldı...");
    }

    @Override
    public boolean sogutucuacıkmı()
    {
        Random sogutucudurum = new Random();
        boolean sogutucudur=sogutucudurum.nextBoolean();
        return sogutucudur;
    }


    public static class Builder
    {

        int sogutmahizi;
        String sesmodu;

        public Builder(){ }

        public Builder saniyedesogutma(float saniyedesogutma){
            this.sogutmahizi = sogutmahizi;
            return this;
        }

        public Builder sesmodu(String sesmodu){
            this.sesmodu = sesmodu;
            return this;
        }

        public Soğutucu build()
        {
            return new Soğutucu(this);
        }

    }

}
