package Task4;

/**
 * The class implements the method for removing duplicate values from the input array and retrurns a new array with duplicated values removed.
 * References:
 *  University of South Australia (UniSA) COMP 2033 - Week 1 - 1.3 - Debugging and Unit Testing, viewed 7th of October 2024, <https://uo.unisa.edu.au/course/view.php?id=3994&sectionid=406856>
 * 	University of South Australia (UniSA) COMP 2033 - Week 3 - 3.1 - Arrays, viewed 7th of October 2024, <https://uo.unisa.edu.au/course/view.php?id=3994&section=36>
 *  Sparke, G 2006, Chapter 9 - Arrays, The Java Way, Pearson Education Australia, Frenchs Forest NSW 2086 Australia, Malaysia, pp. 167 - 180
 *  Sparke, G 2006, Chapter 10 - Class Inheritance, The Java Way, Pearson Education Australia, Frenchs Forest NSW 2086 Australia, Malaysia, pp. 207 - 229
 */
public class CarProcessing {
	/**
	 * The task title specifies "Remove duplicate object from array", my understanding is
	 * removing all duplicate values and leaving behind unique values.
	 * @param carArr	input of array of Car
	 * @return			array of Car with unique values
	 */
	public Car[] removeDuplicates(Car[] carArr)
	{
		if (carArr.length > 0)
		{
			int duplicateCount = 0;
			// 1. Find and mark duplicates as Null
			for(int i = 0; i < carArr.length; i++)
			{
				if (carArr[i] != null)
				{
					Car car = carArr[i];
					
					for (int j = 0; j < carArr.length; j++)
					{
						if (carArr[j] != null && i != j && car.equals(carArr[j]))
						{
							duplicateCount++;
							carArr[j] = null;
							/**
							 * Initially added this to removed all duplicate values including
							 * the original per se. But decided to remove this, as my understanding
							 * of the definition is unique values should remain.
							 */
							//duplicateCount += 2;
							//carArr[i] = null;
						}
					}
				}
			}
			
			// 2. Filter out nulls and add car new Car Array with reduced size
			if ((carArr.length - duplicateCount) > 0)
			{
				Car[] newCarArr = new Car[carArr.length - duplicateCount];
				int newIndex = 0;
				for(int i = 0; i < carArr.length; i++)
				{
					if (carArr[i] != null)
					{
						newCarArr[newIndex] = carArr[i];
						newIndex++;
					}
				}
				
				return newCarArr;
			}
			
		}
		return null;
	}
}
