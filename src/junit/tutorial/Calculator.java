package junit.tutorial;

public class Calculator {
	public int multiply(int x, int y) {
		return x * y;
	}
	
	public float divide(int x, int y) {
		if (y == 0) throw new IllegalArgumentException("divide ny zero.");
		return (float)x / (float)y;
	}
}
