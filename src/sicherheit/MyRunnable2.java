package sicherheit;

public class MyRunnable2 implements Runnable
{
    Addierer gemeinsamesObjekt;
    public MyRunnable2(Addierer tsc)
    {
        this.gemeinsamesObjekt = tsc;
    }

    public void run()
    {
        gemeinsamesObjekt.initialisiereY();
    }
}
