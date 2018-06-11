package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double d, double d2) throws IllegalArgumentException{
		try {
		if (d2==0) {
			throw new IllegalArgumentException();
		}
		else {
			return d/d2;
		}
		} catch (Exception e) {
			throw new IllegalArgumentException();
		}
		
	}
}
