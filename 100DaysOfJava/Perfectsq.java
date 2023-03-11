public class Perfectsq{

	static boolean isPerfectSquare(int x)
	{
		if (x >= 0) {
		
			int sr = (int)Math.sqrt(x);
		
			return ((sr * sr) == x);
		}
		return false;
	}

//Print the
	public static void main(String[] args)
	{
		int x = 84;

		if (isPerfectSquare(x))
			System.out.print("True");
		else
			System.out.print("False");
	}
}
