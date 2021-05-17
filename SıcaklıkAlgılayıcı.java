import java.util.Random;

public class SıcaklıkAlgılayıcı extends Observable implements IMerkeziİslemBirimi {

  int anliksicaklik;

    SıcaklıkAlgılayıcı()
    {
        Random r=new Random();
        anliksicaklik=r.nextInt(40)+10;
    }


    public void Sicaklikkontrol() throws InterruptedException {
        if(anliksicaklik>=40) haberVer();

    }

    @Override
    public int sıcaklikdondur() throws InterruptedException
    {
          return anliksicaklik;
    }
}
