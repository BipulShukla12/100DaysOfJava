public class Sumnn{
   public static void main (String[]args){

     int num = 123, 
     sum = 0;
     //loop to find sum
     while(num!=0){
         sum += num % 5;
         num = num / 5;
     }
       System.out.println ("Sum of digits : " + sum);
   }
 }
