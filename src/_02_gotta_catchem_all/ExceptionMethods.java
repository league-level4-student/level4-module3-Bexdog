package _02_gotta_catchem_all;

public class ExceptionMethods{
	public static double divide(double a, double b) {
		if(b!=0.0) {
			return a/b;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	public static String reverseString(String input) {
		if(input.equals("")) {
			throw new IllegalStateException();
		}
		String end = "";
		for(int i = input.length()-1 ; i>=0;i--) {
			end = end+input.charAt(i);
		}
		return end;
		
	}
}
