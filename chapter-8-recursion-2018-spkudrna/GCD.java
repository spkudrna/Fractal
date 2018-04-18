public class GCD
{
     public static void main (String[] args)
   {
       System.out.println(GCD(4, 4));
   }// end of main
   
   public static int GCD (int num1, int num2)
   {
      if (num2 <= num1 && num2 % num1 == 0)
      {
          return num2;
      }
      
      else if (num1 < num2)
      {
         return GCD(num2, num1);
      }
      
      else
      {
          return GCD(num2, num1%num2);
      }
   }
}