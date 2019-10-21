package cse360assign3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	@Test
	void initTest() { //tests if initial values are correct
		AddingMachine adder = new AddingMachine();
		assertEquals(adder.getTotal(), 0);
		assertEquals(adder.toString(), "0");
	}
	
	@Test
	void addingTest() { //tests if adding functionality is correct
		AddingMachine adder = new AddingMachine();
		int value1 = (int)(Math.random() * (100) + 1);
		int value2 = (int)(Math.random() * (100) + 1);
		int value3 = (int)(Math.random() * (100) + 1);
		int total = value1 + value2 + value3;
		String history = "0 + " + value1 + " + " + value2 + " + " + value3;
		adder.add(value1);
		adder.add(value2);
		adder.add(value3);
		assertEquals(adder.getTotal(), total);
		assertEquals(adder.toString(), history);
	}
	
	@Test
	void subtractingTest() { //tests if subtracting functionality is correct
		AddingMachine adder = new AddingMachine();
		int value1 = (int)(Math.random() * (100) + 1);
		int value2 = (int)(Math.random() * (100) + 1);
		int value3 = (int)(Math.random() * (100) + 1);
		int total = 0 - value1 - value2 - value3;
		String history = "0 - " + value1 + " - " + value2 + " - " + value3;
		adder.subtract(value1);
		adder.subtract(value2);
		adder.subtract(value3);
		assertEquals(adder.getTotal(), total);
		assertEquals(adder.toString(), history);
		//System.out.println(adder.toString());
	}
	
	@Test
	void iterativeTest() { //tests 100 iterations of 500 operations each
		for (int iterations = 0; iterations < 100; iterations++) {
			AddingMachine adder = new AddingMachine();
			int sum = 0;
			String history = "0";
			for(int i = 0; i < 500; i++) {
				int value = (int)(Math.random() * (100) + 1);
				switch (value % 2) {
				case 1: 
					adder.add(value);
					sum += value;
					assertEquals(sum, adder.getTotal());
					history += " + " + value;
					assertEquals(history, adder.toString());
						break;
					
				case 0: 
					adder.subtract(value);
					sum -= value;
					assertEquals(sum, adder.getTotal());
					history += " - " + value;
					assertEquals(history, adder.toString());
						break;
					
				default: 
					
						break;
				}
			}
		}
	}

}
