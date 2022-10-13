package unsicherheit;

public class MyRunnable3 implements Runnable
{
    Addierer gemeinsamesObjekt;

    public MyRunnable3(Addierer gemeinsamesObjekt)
    {
        this.gemeinsamesObjekt = gemeinsamesObjekt;
    }

    public void run()
    {
        gemeinsamesObjekt.addiere();
    }
}
