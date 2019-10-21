package cse360assign3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	@Test
	void iterativeTest() { //tests 100 iterations of 500 operations each
		for (int iterations = 0; iterations < 100; iterations++) {
			Calculator adder = new Calculator();
			int sum = 0;
			String history = "0";
			for(int i = 0; i < 10; i++) {
				int value = (int)(Math.random() * (100) + 1);
				switch (value % 5) {
				case 0: 
					adder.add(value);
					sum += value;
					assertEquals(sum, adder.getTotal());
					history += " + " + value;
					assertEquals(history, adder.toString());
						break;
					
				case 1: 
					adder.subtract(value);
					sum -= value;
					assertEquals(sum, adder.getTotal());
					history += " - " + value;
					assertEquals(history, adder.toString());
						break;
				case 2: 
					adder.multiply(value);
					sum *= value;
					assertEquals(sum, adder.getTotal());
					history += " * " + value;
					assertEquals(history, adder.toString());
						break;
						
				case 3: 
					adder.divide(value);
					sum /= value;
					assertEquals(sum, adder.getTotal());
					history += " / " + value;
					assertEquals(history, adder.toString());
						break;
						
				case 4: 
					adder.power(value);
					sum ^= value;
					assertEquals(sum, adder.getTotal());
					history += " ^ " + value;
					assertEquals(history, adder.toString());
						break;
						
					
				default: 
					
						break;
				}
			}
			System.out.println(adder.toString());
		}
		
		
	}

}
