package Task1;

/**
 * Task 1 is to implement CesarCypher class which encodes and decodes an array
 * of Characters
 * References:
 * 	University of South Australia (UniSA) COMP 2033 - Week 1 - 1.2 - Java Fundamentals, viewed 7th of October 2024, <https://uo.unisa.edu.au/course/view.php?id=3994&sectionid=406855>
 *  University of South Australia (UniSA) COMP 2033 - Week 1 - 1.3 - Debugging and Unit Testing, viewed 7th of October 2024, <https://uo.unisa.edu.au/course/view.php?id=3994&sectionid=406856>
 * 	University of South Australia (UniSA) COMP 2033 - Week 3 - 3.1 - Arrays, viewed 7th of October 2024, <https://uo.unisa.edu.au/course/view.php?id=3994&section=36>
 *  Sparke, G 2006, Chapter 9 - Arrays, The Java Way, Pearson Education Australia, Frenchs Forest NSW 2086 Australia, Malaysia, pp. 167 - 180
 */
public class CaesarCypher {

	/**
	 * This function takes a input array of characters and an offset,
	 * First it is validated to ensure the characters are in the valid range of:
	 * 	* 0 - 9
	 * 	* A - Z
	 * 	* a - z
	 * 
	 *  Each character in the array is off-setted however, if it reaches the end of the range
	 *  defined above, then it will begin at the beginning of the range (z will wrap around a, minus the distance between the current
	 *  character and z and minus 1 since z has already been off-setted).
	 *  
	 *  If the range is not valid then it will return a null value.
	 *  
	 * @param arr 		input array of characters
	 * @param offset	number of characters it should offset by
	 * @return			array of characters that have been off-setted or null for invalid character found
	 */
	public char[] encode (char[] arr, int offset)
	{
		// 1. Validate input
		if (arr != null && arr.length > 0 && offset > 0)
		{
			
			char[] encodedArray = new char[arr.length];
			boolean validArray = false;
			// 2. Validate array
			for (char c : arr)
			{
				if ((c >= '0' && c <= '9'))
				{
					validArray = true;
				}				
				else if ((c >= 'A' && c <= 'Z'))
				{
					validArray = true;
				}
				else if ((c >= 'a' && c <= 'z'))
				{
					validArray = true;
				}
				else
				{
					validArray = false;
					break;
				}
			}	
			
			// 3. if valid array then offset characters
			if (validArray == true)
			{
				for (int i = 0; i < arr.length; i++)
				{
					if ((char) (arr[i] + offset) > '9' && (char) (arr[i] + offset) < 'A')
					{
						encodedArray[i] = (char)('0' + offset-('9'-arr[i])-1);
					}
					else if ((char) (arr[i] + offset) > 'Z' && (char) (arr[i] + offset) < 'a')
					{
						encodedArray[i] = (char)('A' + offset-('Z'-arr[i])-1);
					}
					else if ((char) (arr[i] + offset) > 'z')
					{
						encodedArray[i] = (char)('a' + offset-('z'-arr[i])-1);
					}
					else
					{
						encodedArray[i] = (char) (arr[i] + offset);
					}
				}
				
				return encodedArray;
			}
		}
		
		
		return null;
	}
	
	/**
	 * This function takes a input array of characters and an offset,
	 * First it is validated to ensure the characters are in the valid range of:
	 * 	* 0 - 9
	 * 	* A - Z
	 * 	* a - z
	 * 
	 *  Each character in the array is off-setted however, if it reaches the end of the range
	 *  defined above, then it will begin at the beginning of the range (a will wrap around z, minus the distance between the current
	 *  character and a and minus 1 since a has already been off-setted).
	 *  
	 *  If the range is not valid then it will return a null value.
	 *  
	 * @param arr 		input array of characters
	 * @param offset	number of characters it should offset by
	 * @return			array of characters that have been off-setted or null for invalid character found
	 */	
	public char[] decode (char[] arr, int offset)
	{
		// 1. Validate input
		if (arr != null && arr.length > 0 && offset > 0)
		{
			char[] decodedArray = new char[arr.length];
			boolean validArray = false;
			
			// 2. Validate array
			for (char c : arr)
			{
				if ((c >= '0' && c <= '9'))
				{
					validArray = true;
				}				
				else if ((c >= 'A' && c <= 'Z'))
				{
					validArray = true;
				}
				else if ((c >= 'a' && c <= 'z'))
				{
					validArray = true;
				}
				else
				{
					validArray = false;
					break;
				}
			}			

			// 3. if valid array then offset characters
			if (validArray == true)
			{			
				for (int i = 0; i < arr.length; i++)
				{
					if ((char) (arr[i] - offset) < '0')
					{
						decodedArray[i] = (char) ('9' - offset-('0'-arr[i])+1);
					}
					else if ((char) (arr[i] - offset) > '9' && (char) (arr[i] - offset) < 'A')
					{
						decodedArray[i] = (char) ('Z' - offset-('A'-arr[i])+1);
					}
					else if ((char) (arr[i] - offset) > 'Z' && (char) (arr[i] - offset) < 'a')
					{
						decodedArray[i] = (char) ('z' - offset-('a'-arr[i])+1);
					}
					else
					{
						decodedArray[i] = (char) (arr[i] - offset);
					}
				}
				
				return decodedArray;
			}
		}
				
		return null;
	}
}
