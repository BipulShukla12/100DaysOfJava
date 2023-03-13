import java.util.Scanner;

public class Smallargeno{
   public static void main(String args[])
   {

       int arr[] = {22, 83, 1, 10, 54, 10};

       int largest = arr[0], smallest=arr[0];

       for(int i=0; i<arr.length; i++) { if(smallest > arr[i])
              smallest = arr[i];
           if(largest < arr[i])
              largest = arr[i];

       }
// print the largest and smallest no
       System.out.println(smallest);
       System.out.println(largest);
   }
}