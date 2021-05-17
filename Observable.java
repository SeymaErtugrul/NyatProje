import java.util.ArrayList;
import java.util.List;

public abstract class Observable
{

    private List<IObserver> observerList;

    public Observable() {
        observerList = new ArrayList<>();
    }

    public void ekle(IObserver observer){
        observerList.add(observer);
    }

    public void cikar(IObserver observer){
        observerList.remove(observer);
    }

    public void haberVer() throws InterruptedException {
        for (IObserver observer : observerList) {
            observer.update(this);
        }
    }

}
