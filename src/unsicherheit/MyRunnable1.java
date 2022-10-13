package unsicherheit;

public class MyRunnable1 implements Runnable
{
    Addierer gemeinsamesObjekt;

    public MyRunnable1(Addierer gemeinsamesObjekt)
    {
        this.gemeinsamesObjekt = gemeinsamesObjekt;
    }

    public void run()
    {
        gemeinsamesObjekt.initialisiereX();
    }
}
