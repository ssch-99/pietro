package unsicherheit;

public class ThreadUnsicherheit
{
    public static void main(String[] args)
    {
        Addierer gemeinsamesObjekt = new Addierer();

        for (int i = 0; i < 20; i++)
        {
            gemeinsamesObjekt.initalisiere();
            Thread t1 = new Thread(new MyRunnable1(gemeinsamesObjekt));
            Thread t2 = new Thread(new MyRunnable2(gemeinsamesObjekt));
            Thread t3 = new Thread(new MyRunnable3(gemeinsamesObjekt));
            try
            {
                t1.start(); t2.start(); t3.start();
                t1.join();  t2.join();  t3.join();  // warten, bis alle fertig sind
            } catch (InterruptedException ie) { /* nop */ }
            System.out.println("x="+gemeinsamesObjekt.x()+" y="+gemeinsamesObjekt.y()+" z="+gemeinsamesObjekt.z());
        }
    }
}
