public class Abundent{


//Ab
   public static void main (String[]args)
   {

     int n = 12, sum = 0;

     for (int i = 1; i < n; i++) { if (n % i == 0) sum = sum + i; } if (sum > n)
       {
     	System.out.println (n + " is an Abundant Number");
     	System.out.println ("The Abundance is: " + (sum - n));
       }
     else
       System.out.println (n + " is not an Abundant Number");
   }
 }
