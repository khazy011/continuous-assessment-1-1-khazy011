package Task3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayCountTest {

	ArrayCount arrayCount = new ArrayCount();
	
	@Test
	void zeroCountTest() {
		String[] arrStr = {"Apple", "Orange", "Banana"};
		String target = "Strawberry";
		
		int count = arrayCount.count(arrStr, target);
		assertEquals(0, count);
	}
	
	@Test
	void oneOccurenceTest()
	{
		String[] arrStr = {"Apple", "Orange", "Banana"};
		String target = "Apple";
		
		int count = arrayCount.count(arrStr, target);
		assertEquals(1, count);		
	}
	
	@Test
	void multipleOccurenceTest()
	{
		String[] arrStr = {"Apple", "Orange", "Apple", "Banana", "Apple" };
		String target = "Apple";
		
		int count = arrayCount.count(arrStr, target);
		assertEquals(3, count);			
	}	

	@Test
	void nullArrayCountTest() 
	{
		String[] arrStr = null;
		String target = "Strawberry";
		
		int count = arrayCount.count(arrStr, target);
		assertEquals(-1, count);		
	}
	
	@Test
	void initialisedArrayWithNoValuesTest()
	{
		String[] arrStr = new String[4];
		String target = "Strawberry";
		
		int count = arrayCount.count(arrStr, target);
		assertEquals(0, count);			
	}
	@Test
	void nullStringTargetValueTest()
	{
		String[] arrStr = {"Apple", "Orange", "Banana"};
		String target = null;
		
		int count = arrayCount.count(arrStr, target);
		assertEquals(-1, count);		
	}
	
	@Test
	void emptyStringTargetValueTest()
	{
		String[] arrStr = {"Apple", "Orange", "Banana"};
		String target = "";
		
		int count = arrayCount.count(arrStr, target);
		assertEquals(0, count);		
	}

	@Test
	void whiteSpaceStringTargetValueTest()
	{
		String[] arrStr = {"Apple", "Orange", "Banana"};
		String target = " ";
		
		int count = arrayCount.count(arrStr, target);
		assertEquals(0, count);		
	}
	
}
