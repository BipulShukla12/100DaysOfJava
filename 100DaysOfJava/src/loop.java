import java.util.Scanner;

// print Numbers from 1 to 5.
public class loop {
      public static void main(String[] args) {
           // for(int i = 1; i <=5; i +=1){
                 // System.out.println( i );
            //}
 //print number 1 to n.          
            Scanner in = new Scanner (System.in);
            int n = in.nextInt();

            for(int i = 1; i<=n; i++){
                  System.out.println(i + " ");
            }


      }
}
