public interface IObserver
{
    void update(Observable observable) throws InterruptedException;
}
