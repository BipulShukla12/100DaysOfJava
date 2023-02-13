public class Leapyear{
   public static void main (String[]args){

     int year = 2021;
       //leap year
     if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
       System.out.println (year + " is a Leap Year");

     //not leap year
     else
         System.out.println (year + " is not a Leap Year");

   }
 }