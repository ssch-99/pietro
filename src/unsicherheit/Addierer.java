package unsicherheit;

public class Addierer
{
    private int x, y, z;

    public void initalisiere()
    {
        x = y = z = 0;
    }

    public int x() { return x; }
    public int y() { return y; }
    public int z() { return z; }

    public void initialisiereX()
    {
        try
        {   Thread.sleep((long)(1));
            x = 1;
        }
        catch (InterruptedException ie) { /* nop */ }
    }

    public void initialisiereY()
    {
        try
        {   Thread.sleep((long)(1));
            y = 2;
        }
        catch (InterruptedException ie) { /* nop */ }
    }

    public void addiere()
    {
        try
        {   Thread.sleep((long)(1));
            z = x + y;
        }
        catch (InterruptedException ie) { /* nop */ }
    }
}
