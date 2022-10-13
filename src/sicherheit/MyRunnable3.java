package sicherheit;

public class MyRunnable3 implements Runnable
{
    Addierer gemeinsamesObjekt;
    public MyRunnable3(Addierer tsc)
    {
        this.gemeinsamesObjekt = tsc;
    }

    public void run()
    {
        gemeinsamesObjekt.addiere();
    }
}

