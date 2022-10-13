package unsicherheit;

public class MyRunnable2 implements Runnable
{
    Addierer gemeinsamesObjekt;

    public MyRunnable2(Addierer gemeinsamesObjekt)
    {
        this.gemeinsamesObjekt = gemeinsamesObjekt;
    }

    public void run()
    {
        gemeinsamesObjekt.initialisiereY();
    }
}
