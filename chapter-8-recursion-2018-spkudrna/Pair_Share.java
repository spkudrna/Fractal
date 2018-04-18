/**
 * Pair Share.
 * 
 * @author () 
 * @version ()
 */

public class Pair_Share
{
    /**
     * Default constructor for objects of class Pair_Share
     */
    public static void main()
    {
        //Printb(5);
        Printf(5);
        System.out.println(isPrime(199, 2));
    }
    
    public static void Printf(int n)
    {
        if (n==-1)
            return;
        else
        {
            //System.out.println(n);
            Printf(n-1);
            System.out.println(n);
        }
    }
     
  
    public static void Printb(int n)
    {
        if (n==0)
            return;
        else
        {
            System.out.println(n);
            Printb(n-1);
        
        }
    }
    
    public static void Printreverse(String string)
    {
        if (string.length() == 0)
            return;
        else
        {
            System.out.println(string.charAt(string.length() -1));
            String string1 = "";
            
            //this is substring
            for (int i = 0; i <= string.length() -2 ; i++)
            {
                string1 += string.charAt(i);
            }
            
            Printreverse(string1);
        }
    }
    
    public static boolean isPrime(int n, int currDivisor)
    {
        if(n < 2){
            return true;
        }
        if(currDivisor == (n/2)){
            return true;
        }
        else if(n % currDivisor == 0 ){
            return false;           
        }
        else{
            return isPrime(n, currDivisor + 1);
        }
    }
}
