package opgave1;

public class Opgave1 {

	public static void main(String[] args) {
		System.out.println(factorial(8));
		
	
		System.out.println(reverse("OleEgon"));

	}
	
	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}
	
	public static int power(int n, int p) {
		if (p == 0) {
			return 1;
		}
		
		else {
			return power(n,p-1) * n;
		}
	}
	
	public static int power2(int n, int p) {
		if (p == 0) {
			return 1;
		}
		if (p % 2 != 0) {
			return power2(n,p-1) * n;
		}
		else {
			return power2((n*n), p / 2);
		}
	}
	 
	public static int prod(int a, int b) {
		if (a == 0) {
			return 0;
		}
		
		else {
			return prod(a - 1, b) + b;
		}
		
	}
	
	public static String reverse(String s) {
		if (s == null || s.length() <= 1) {
			return s;
		}
		
		else {
			return reverse(s.substring(1)) + s.charAt(0);
		}
	}
}
