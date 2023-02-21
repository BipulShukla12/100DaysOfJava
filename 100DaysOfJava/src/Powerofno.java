public class Powerofno{
	public static void main(String[] args) {
	    
	double base = 2.5;
    // Works only when exponent is  
    int expo = 2;
    double res = 1.0;
    
    while (expo != 0) {
        res *= base;
        expo--;
    }
    
    System.out.println("Result = " + res); 
	}
}
