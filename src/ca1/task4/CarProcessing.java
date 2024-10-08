package ca1.task4;


/**
 * The class implements the method for removing duplicate values from the input array and retrurns a new array with duplicated values removed.
 * References:
 *  University of South Australia (UniSA) COMP 2033 - Week 1 - 1.3 - Debugging and Unit Testing, viewed 7th of October 2024, <https://uo.unisa.edu.au/course/view.php?id=3994&sectionid=406856>
 * 	University of South Australia (UniSA) COMP 2033 - Week 3 - 3.1 - Arrays, viewed 7th of October 2024, <https://uo.unisa.edu.au/course/view.php?id=3994&section=36>
 *  Sparke, G 2006, Chapter 9 - Arrays, The Java Way, Pearson Education Australia, Frenchs Forest NSW 2086 Australia, Malaysia, pp. 167 - 180
 *  Sparke, G 2006, Chapter 10 - Class Inheritance, The Java Way, Pearson Education Australia, Frenchs Forest NSW 2086 Australia, Malaysia, pp. 207 - 229
 */
public class CarProcessing {
	public static void main(String[] args) {
		
		CarProcessing cp = new CarProcessing();
		
		Car[] cars = { 
				new Car("Honda", "Civic", "Red"),
				new Car("Holden", "Civic", "Red"),
				new Car("Jeep", "Wrangler", "Blue"),
				new Car("Jeep", "Wrangler", "Green"),
				new Car("Holden", "Falcon", "Yellow"),
				new Car("Honda", "Civic", "Blue"),
				new Car("Honda", "Falcon", "Blue"),
				new Car("Honda", "Civic", "Purple")
		};
		
		Car[] noDuplicates = cp.removeDuplicates(cars);
		
		for(Car c : noDuplicates ) {
			System.out.println(c);
		}
	}
	
	/**
	 * The task title specifies "Remove duplicate object from array", my understanding is
	 * removing all duplicate values and leaving behind unique values.
	 * @param inputArray	input of array of Car
	 * @return			array of Car with unique values
	 */
	public Car[] removeDuplicates(Car[] inputArray)
	{
		if (inputArray.length > 0)
		{
			int duplicateCount = 0;
			// 1. Find and mark duplicates as Null
			for(int i = 0; i < inputArray.length; i++)
			{
				if (inputArray[i] != null)
				{
					Car car = inputArray[i];
					
					for (int j = 0; j < inputArray.length; j++)
					{
						if (inputArray[j] != null && i != j && car.equals(inputArray[j]))
						{
							duplicateCount++;
							inputArray[j] = null;
							/**
							 * Initially added this to removed all duplicate values including
							 * the original per se. But decided to remove this, as my understanding
							 * of the definition is unique values should remain.
							 */
							//duplicateCount += 2;
							//inputArray[i] = null;
						}
					}
				}
			}
			
			// 2. Filter out nulls and add car new Car Array with reduced size
			if ((inputArray.length - duplicateCount) > 0)
			{
				Car[] newinputArray = new Car[inputArray.length - duplicateCount];
				int newIndex = 0;
				for(int i = 0; i < inputArray.length; i++)
				{
					if (inputArray[i] != null)
					{
						newinputArray[newIndex] = inputArray[i];
						newIndex++;
					}
				}
				
				return newinputArray;
			}
			
		}
		return null;
	}
	
}
