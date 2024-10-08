package Task4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CarTest {

	Car car1;
	Car car2;
	
	/**
	 * Testing equal function and hashcode calculating correctly when
	 * all Make, Model, Color is the same.
	 */
	@Test
	void CarMatchTest() {
		car1 = new Car("Toyota", "MR2", "Red");
		car2 = new Car("Toyota", "MR2", "Red");
		
		assertTrue(car1.equals(car2));
	}

	/**
	 * Testing equal function and hashcode calculating correctly when
	 * all Model, Color is the same.
	 */
	@Test
	void CarMatchTwoTest() {
		car1 = new Car("Nissan", "350GT", "Red");
		car2 = new Car("Infiniti", "350GT", "Red");
		
		assertTrue(car1.equals(car2));
	}	
	
	/**
	 * Testing equal function and hashcode calculating correctly when
	 * all Make, Color is the same and Model is different.
	 */
	@Test
	void CarNotMatchOneTest() {
		car1 = new Car("Toyota", "MR2", "Red");
		car2 = new Car("Toyota", "Celica", "Red");
		
		assertFalse(car1.equals(car2));
	}

	/**
	 * Testing equal function and hashcode calculating correctly when
	 * all Make, Model is the same and Color is different.
	 */
	@Test
	void CarNotMatchTwoTest() {
		car1 = new Car("Toyota", "MR2", "Red");
		car2 = new Car("Toyota", "MR2", "Blue");
		
		assertFalse(car1.equals(car2));
	}
	
	/**
	 * Testing equal function and hashcode calculating correctly when
	 * all Make, Model, Color is the not same.
	 */
	@Test
	void CarNotMatchThreeTest() {
		car1 = new Car("Nissan", "350GT", "Red");
		car2 = new Car("Infiniti", "370GT", "White");
		
		assertFalse(car1.equals(car2));
	}
}
