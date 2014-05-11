package junit.tutorial;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class CalculatorTest {
	// Multiply
	@Test
	public void getMultiplicationResultOf3And4() {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.multiply(3, 4);
		assertThat(actual, is(expected));
	}
	@Test
	public void getMultiplicationResultOf5And7() {
		Calculator calc = new Calculator();
		int expected = 35;
		int actual = calc.multiply(5, 7);
		assertThat(actual, is(expected));
	} 
	
	// Divide
	@Test
	public void getDivideResultOf3And2() {
		Calculator calc = new Calculator();
		float expected = 1.5F;
		float actual = calc.divide(3, 2);
		assertThat(actual, is(expected));
	}
	@Test(expected = IllegalArgumentException.class)
	public void getMultiplicationResultOf5And0() {
		Calculator calc = new Calculator();
		calc.divide(5, 0);
	}
}
