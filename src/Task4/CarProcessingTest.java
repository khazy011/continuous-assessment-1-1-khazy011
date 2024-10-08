package Task4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarProcessingTest {

	CarProcessing carProcessing = new CarProcessing();
	/**
	 * There is no duplicate values, so nothing should be removed.
	 */
	@Test
	void testRemoveNoDuplicates() {
		Car[] carList = {
				new Car("Nissan", "350GT", "White"),
				new Car("Toyota", "Supra", "Silver"),
				new Car("Mazda", "RX7", "Yellow")
		};

		Car[] carListExpected = {
				new Car("Nissan", "350GT", "White"),
				new Car("Toyota", "Supra", "Silver"),
				new Car("Mazda", "RX7", "Yellow")
		};		
		
		Car[] actualList = carProcessing.removeDuplicates(carList);
		
		assertArrayEquals(carListExpected, actualList);
	}
	
	/**
	 * One of the Nissan, 350GT, White Car should be removed.
	 */
	@Test
	void testOneRemoveOneDuplicates() {
		Car[] carList = {
				new Car("Nissan", "350GT", "White"),
				new Car("Toyota", "Supra", "Silver"),
				new Car("Mazda", "RX7", "Yellow"),
				new Car("Nissan", "350GT", "White"),
		};

		Car[] carListExpected = {
				new Car("Nissan", "350GT", "White"),
				new Car("Toyota", "Supra", "Silver"),
				new Car("Mazda", "RX7", "Yellow")
		};		
		
		Car[] actualList = carProcessing.removeDuplicates(carList);
		
		assertArrayEquals(carListExpected, actualList);
	}
	
	/**
	 * Inifiniti, 350GT, White Car (Nissan, 350GT, White Car should remain since it's first 
	 * on the list) & Mazda RX7 Yellow Car should be removed.
	 */	
	@Test
	void testRemoveTwoDuplicates() {
		Car[] carList = {
				new Car("Nissan", "350GT", "White"),
				new Car("Toyota", "Supra", "Silver"),
				new Car("Mazda", "RX7", "Yellow"),
				new Car("Infiniti", "350GT", "White"),
				new Car("Mazda", "RX7", "Yellow"),
		};

		Car[] carListExpected = {
				new Car("Nissan", "350GT", "White"),
				new Car("Toyota", "Supra", "Silver"),
				new Car("Mazda", "RX7", "Yellow")
		};		
		
		Car[] actualList = carProcessing.removeDuplicates(carList);
		
		assertArrayEquals(carListExpected, actualList);
	}	
	

}
