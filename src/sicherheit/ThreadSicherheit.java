package sicherheit;

public class ThreadSicherheit
{
    public static void main(String[] args)
    {
        Addierer sicheresObjekt = new Addierer();
        for (int i = 0; i < 20; i++)
        {
            sicheresObjekt.init();
            Thread t1 = new Thread(new MyRunnable1(sicheresObjekt));
            Thread t2 = new Thread(new MyRunnable2(sicheresObjekt));
            Thread t3 = new Thread(new MyRunnable3(sicheresObjekt));
            try
            {
                t1.start(); t2.start(); t3.start();
                /* t1.join();  t2.join(); */  t3.join();
            } catch (InterruptedException ie) { /* nop */ }
            System.out.println("x="+sicheresObjekt.x()+" y="+sicheresObjekt.y()+" z="+sicheresObjekt.z());
        }
    }
}
