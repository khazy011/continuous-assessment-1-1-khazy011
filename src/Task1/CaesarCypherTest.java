package Task1;

import static org.junit.jupiter.api.Assertions.*; 

import org.junit.jupiter.api.Test;

class CaesarCypherTest {

	public CaesarCypher cesarCypher = new CaesarCypher();
	/**
	 * Test for encoding characters where each character is offset by 1.
	 */
	@Test
	void encodeOffSet1Test()
	{
		char[] testArray = {'a', 'b', 'c', 'd'};
		char[] expectedArray = {'b', 'c', 'd', 'e'};
		char[] resultArray = cesarCypher.encode(testArray, 1);
		
		assertArrayEquals(expectedArray, resultArray);
	}
	
	/**
	 * Test for encoding characters where each character is offset by 2.
	 */	
	@Test 
	void encodeOffSet2Test()
	{
		char[] testArray = {'a', 'b', 'c', 'd'};
		char[] expectedArray = {'c', 'd', 'e', 'f'};
		char[] resultArray = cesarCypher.encode(testArray, 2);
		
		assertArrayEquals(expectedArray, resultArray);		
	}
	
	/**
	 * Test for encoding characters where each character is offset by 1.
	 * However, testing wrap around i.e. when character is 'z' it should be 'a'
	 */	
	@Test 
	void encodeOffSet3Test()
	{
		char[] testArray = {'z', 'b', 'c', 'd'};
		char[] expectedArray = {'a', 'c', 'd', 'e'};
		char[] resultArray = cesarCypher.encode(testArray, 1);
		
		assertArrayEquals(expectedArray, resultArray);		
	}
	
	/**
	 * Test for encoding characters where each character is offset by b.
	 * However, testing wrap around i.e. when character is 'z' it should be 'b'
	 */		
	@Test 
	void encodeOffSet4Test()
	{
		char[] testArray = {'y', 'z', 'a', 'b'};
		char[] expectedArray = {'a', 'b', 'c', 'd'};
		char[] resultArray = cesarCypher.encode(testArray, 2);
		
		assertArrayEquals(expectedArray, resultArray);		
	}		
	
	/**
	 * Test for when input array is null
	 */		
	@Test
	void nullArrayEncodeTest()
	{
		char[] testArray = null;
		char[] resultArray = cesarCypher.encode(testArray, 1);
		
		assertNull(resultArray);
	}
	
	/**
	 * Test for input array when initalised to an empty array.
	 */		
	@Test
	void emptyArray2EncodeTest()
	{
		char[] testArray = new char[4];
		char[] resultArray = cesarCypher.encode(testArray, 1);
		
		assertNull(resultArray);
	}
	
	/**
	 * Test for invalid offset value
	 */			
	@Test
	void InvalidOffsetEncodeTest()
	{
		char[] testArray = {'a', 'b', 'c', 'd'};
		char[] resultArray = cesarCypher.encode(testArray, 0);
		
		assertNull(resultArray);
	}

	/**
	 * Test for decoding characters where each character is offset by 1.
	 */
	@Test
	void decodeOffSet1Test()
	{
		char[] testArray = {'b', 'c', 'd', 'e'};
		char[] expectedArray = {'a', 'b', 'c', 'd'};
		char[] resultArray = cesarCypher.decode(testArray, 1);
		
		assertArrayEquals(expectedArray, resultArray);	
	}
	
	/**
	 * Test for decoding characters where each character is offset by 2.
	 */	
	@Test
	void decodeOffSet2Test()
	{
		char[] testArray = {'c', 'd', 'e', 'f'};
		char[] expectedArray = {'a', 'b', 'c', 'd'};
		char[] resultArray = cesarCypher.decode(testArray, 2);
		
		assertArrayEquals(expectedArray, resultArray);			
		
	}
	
	/**
	 * Test for encoding characters where each character is offset by 1.
	 * However, testing wrap around i.e. when character is 'a' it should be 'z'
	 */		
	@Test
	void decodeOffSet3Test()
	{
		char[] testArray = {'a', 'b', 'd', 'e'};
		char[] expectedArray = {'z', 'a', 'c', 'd'};
		char[] resultArray = cesarCypher.decode(testArray, 1);
		
		assertArrayEquals(expectedArray, resultArray);			
		
	}

	/**
	 * Test for encoding characters where each character is offset by 2.
	 * However, testing wrap around i.e. when character is 'b' it should be 'z'
	 */		
	@Test
	void decodeOffSet4Test()
	{
		char[] testArray = {'y', 'b', 'd', 'e'};
		char[] expectedArray = {'w', 'z', 'b', 'c'};
		char[] resultArray = cesarCypher.decode(testArray, 2);
		
		assertArrayEquals(expectedArray, resultArray);			
		
	}
	
	/**
	 * Test for when input array is null
	 */			
	@Test
	void nullArrayDecodeTest()
	{
		char[] testArray = null;
		char[] resultArray = cesarCypher.decode(testArray, 1);
		
		assertNull(resultArray);
	}

	/**
	 * Test for input array when initalised to an empty array.
	 */		
	@Test
	void emptyArray2DecodeTest()
	{
		char[] testArray = new char[4];
		char[] resultArray = cesarCypher.decode(testArray, 1);
		
		assertNull(resultArray);
	}
	
	/**
	 * Test for invalid offset value
	 */	
	@Test
	void InvalidOffsetDecodeTest()
	{
		char[] testArray = {'a', 'b', 'c', 'd'};
		char[] resultArray = cesarCypher.decode(testArray, 0);
		
		assertNull(resultArray);
	}	
	
}
