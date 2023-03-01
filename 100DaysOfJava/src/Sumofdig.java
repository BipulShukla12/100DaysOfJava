public class Sumofdig{

   public static void main (String[]args){

     int num = 12345, 
     sum = 0;
     while(num!=0){

         sum += num % 10;
         num = num / 10;
     }
  //Print num
      System.out.println ("Sum of digits : " + sum);
   }


 }
