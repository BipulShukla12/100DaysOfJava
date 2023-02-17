public class Power{
	public static void main(String[] args) {
	    
	double base = 1.5;
    // Works only when exponent is positive integers
    int expo = 2;
    double res = 1.0;
    
    while (expo != 0) {
        res *= base;
        expo--;
    }
    
    System.out.println("Result = " + res); 
	}
}
