package ca1.task3;

public class ArrayCount {
	public int count(String[] array, String target) {
		if (array != null && array.length > 0 && (target != null))
		{
			int targetCount = 0;
			
			for(String s: array)
			{
				if (s == target)
				{
					targetCount++;
				}
			}
			
			return targetCount;
		}
		
		return -1;
	}
}
