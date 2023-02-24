import java.util.Scanner;

public class Largestno2
{
  public static void main(String args[])
  {

     int arr[] = {12, 13, 1, 10, 34, 80};

     int max = arr[0];

     for(int i=0; i<arr.length; i++)
     {
       if(max < arr[i])
       {
          max = arr[i];
       }

     }
// print no in this code
    System.out.print(max); 
  }
}
