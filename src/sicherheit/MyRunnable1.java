package sicherheit;

public class MyRunnable1 implements Runnable
{
    Addierer gemeinsamesObjekt;
    public MyRunnable1(Addierer tsc)
    {
        this.gemeinsamesObjekt = tsc;
    }

    public void run()
    {
        gemeinsamesObjekt.initialisiereX();
    }
}
