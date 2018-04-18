public class Palindrome
{
     public static void main (String[] args)
   {
       System.out.println(palindromeTest("amanaplanacanalpanama", 0)); //Palindrome
       System.out.println(palindromeTest("sean", 0)); //Not a Palindrome
       System.out.println(palindromeTest("dogeeseseegod", 0)); //Palindrome
   }// end of main
   
   public static boolean palindromeTest(String word, int i) //i starts as (i == 0)
   {
      //Gets index of last letter
      int last = word.length()-1;
      
      //Base Case (if it gets through whole word)
      if (i == last)
      {
          return true;
      }
      
      //Tests First with Last, then First+1 with Last-1, etc...
      else if (word.charAt(last - i) == word.charAt(i))
      {
          return (palindromeTest(word, i+=1));
      }
      
      //If Above Statment is not True, returns False
      else
      {
          return false;
      }
   }
}