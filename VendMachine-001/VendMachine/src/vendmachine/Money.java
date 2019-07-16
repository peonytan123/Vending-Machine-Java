
package vendmachine;

/**
 *
 * @author admin
 */
public class Money 
{
    static double total=0;
    
    public Money()
    {
    }
    
    public void addMoney(double value)
    {
        total+= value;
    }
    
    public static void setMoney(double value)
    {
        total=value;
    }
    
    public static double getTotal()
    {
        return total;
    }
}


