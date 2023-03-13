import java.util.Scanner;

public class Smallno{
  public static void main(String args[])
  {

     int arr[] = {12, 43, 1, 90, 34, 20};

     int min = arr[0];

     for(int i=0; i<arr.length; i++) { if(min > arr[i])
         {
            min = arr[i];
         }

     }
// print the small
     System.out.print(min); 
  }
}
