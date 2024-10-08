package Task6;

public class DebugSnippets {

	/**
	 * The function access elements from the numbers[] array and assigns to variables secondElement & fifthElement.
	 * This is then printed out with the print statements.
	 */
	public static void accessElements()
	{		
		int[] numbers = {1, 2, 3, 4, 5};
		// zero based index, index value should be 1 less when accessing elements from the array
		//int secondElement = numbers[2];
		//int fifthElement = numbers[5];
		int secondElement = numbers[1];
		int fifthElement = numbers[4];
		// Print statements are incorrect
		//System.out.println("Second element: " + fifthElement);
		//System.out.println("Fifth element: " + secondElement);
		System.out.println("Second element: " + secondElement);
		System.out.println("Fifth element: " + fifthElement);		
	}
	
	/**
	 * This function increments variable 'a' based on the number of iterations from variable 'b'.
	 * 
	 * @param a 	starting off value
	 * @param b 	number of iterations
	 * @return 		increased value of variable 'a'
	 */
	public static int increaseA(int a, int b)
	{
		/*
		 * The below code is incorrect. The while is valid when b is less than 10. a is
		 * incremented by 1, when a divided by 2 has a remainder of 0 then variable b is
		 * incremented by 1. If variable is greater than 10, then the while loop block
		 * does not get executed. Or if b is 9 the while loop block gets executed once.
		 * Therefore, variable a value will never increase by 2 by b (10) number of
		 * times.
		 */
		
		/*
		 * while (b < 10) { 
		 * 	a = a + 1; 
		 * 
		 * 	if (a % 2 == 0) 
		 * 	{ 
		 * 		b++; 
		 * 	} 
		 * }
		 */
		
		/*
		 * Variable a can be any starting value, then value is increased by 2 by b
		 * number of times.
		 */
		for (int i = 0; i < b; i++)
		{
			a += 2;
		}
		
		return a;
	}
	
	/**
	 * This function returns the index once the target value has matched the first value it encounters within
	 * the array numbers.
	 * 
	 * @param 	numbers input array of numbers
	 * @param 	target target value to find
	 * @return 	returns the index of first occurring value found.
	 */
	public static int findIndex(int[] numbers, int target)
	{
		// i should be less than array length size, since arrays comes in different sizes
		for (int i = 0; i < numbers.length /*13*/; i++)
		{
			if (numbers[i] == target)
			{
				return i;
			}
			//i++; // not needed because the for loop is incrementing it.
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] numbers = {5, 10, 12, 15, 33, 2, 500};
		
		accessElements();
		System.out.println("a is : " + increaseA(0, 10));
		System.out.println("Index position of 33: " + findIndex(numbers, 33));
		System.out.println("Index position of 7: " + findIndex(numbers, 7));
		
	}

}
