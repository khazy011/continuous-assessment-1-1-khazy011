package ca1.task7;

/**
 * This code is the corrected implementation of the Python code. See below:
 * data = [1, 2, 3, 4, 5]
 *
 *	for i in data:
 *   	i = i * i
 *
 *	data = 5
 *	data = data + 5
 */
public class Task7Snippet {

	public static void main(String[] args) {
		int[] data = {1, 2, 3, 4, 5};

		/**
		 * In the Python code; after iterating through the list with a for loop, the
		 * values inside the list does not change. In this Java for loop code below it does.
		 */		
		for (int i = 0; i < data.length/*3*/; i++) // The for loop secondary condition should be data.length since the array size is greater than 3.
		{
			data[i] = data[i] * data[i];
		}
		
		printData(data);
		
		//data[0] = 5;
		int number = 5;
		System.out.println("Number: " + number);
		//data[0] = data[0] + 5; 
		number += number + 5;
		System.out.println("Number: " + number);
	}
	
	public static void printData(int[] data) {
		for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
		}
		System.out.println();
	}
	
	/**
	 * Q: Does the above code match the Python code in this comment. 
	 * If not, what is different? 
	 * and what needs to be done to make it match? 
	 *
	 * Python code:
	 * data = [1, 2, 3, 4, 5]
	 * for i in data:
     *    i = i * i
	 * data = 5
	 * data = data + 5
	 *
	 * A: 
	 * In the Python code; after iterating through the list with a for loop, the
	 * values inside the list does not change. In this Java for loop code above the 
	 * value does change.
	 * 
	 * Secondly, when assigning 5 to data; the variable type changes from a list to 
	 * int variable, therefore data will be 5. 
	 * 
	 * And when data = data + 5 is executed, the variable type still would be an int but 
	 * with the value of 10.
	 * 
	 * In Java, you're unable dynamically change int[] to int since the array is explicitly 
	 * initialised with an array of numbers.
	 * 
	 * Only option is to declare a new variable as an int with the initialised value of 5 
	 * and then perform numerical operations on the integer.
	 */ 

}
