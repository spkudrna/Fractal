import javax.swing.*;
import java.util.*;

public class Fundraising
{
     public static void main (String[] args)
   {
       System.out.println(collect(1000));
   }// end of main
   
   public static int collect (int monataryGoal)
   {
       System.out.println(monataryGoal);
       if (monataryGoal == 1)
       {
           return 1;
       }
       
       else
       {
          return (collect(monataryGoal/10) +
           collect(monataryGoal/10) +
           collect(monataryGoal/10) +
           collect(monataryGoal/10) +
           collect(monataryGoal/10) +
           collect(monataryGoal/10) +
           collect(monataryGoal/10) +
           collect(monataryGoal/10) +
           collect(monataryGoal/10) +
           collect(monataryGoal/10) + 1);
       }
   }
}