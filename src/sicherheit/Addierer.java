package sicherheit;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

public class Addierer
{
    private int x, y, z;
    private Lock schlüssel = new ReentrantLock();
    private Condition ersteZuweisungIstErfolgt = schlüssel.newCondition();
    private Condition zweiteZuweisungIstErfolgt = schlüssel.newCondition();

    public void init()
    {
        x = y = z = 0;
    }

    public int x() { return x; }
    public int y() { return y; }
    public int z() { return z; }

    public void initialisiereX()
    {
        schlüssel.lock();
        try
        {   Thread.sleep((long)(1));
            x = 1;
            ersteZuweisungIstErfolgt.signalAll();
        }
        catch (InterruptedException ie) { /* nop */ }
        finally { schlüssel.unlock(); }
    }

    public void initialisiereY()
    {
        schlüssel.lock();
        try
        {   Thread.sleep((long)(1));
            y = 2;
            zweiteZuweisungIstErfolgt.signalAll();
        }
        catch (InterruptedException ie) { /* nop */ }
        finally { schlüssel.unlock(); }
    }

    public void addiere()
    {
        schlüssel.lock();
        try
        {   Thread.sleep((long)(1));
            if (x == 0) ersteZuweisungIstErfolgt.await();
            if (y == 0) zweiteZuweisungIstErfolgt.await();
            z = x + y;
        }
        catch (InterruptedException ie) { /* nop */ }
        finally { schlüssel.unlock(); }
    }
}
