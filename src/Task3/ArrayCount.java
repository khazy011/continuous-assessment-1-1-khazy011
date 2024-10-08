package Task3;

public class ArrayCount {
	
	public int count(String[] arr, String target)
	{
		if (arr != null && arr.length > 0 && (target != null))
		{
			int targetCount = 0;
			
			for(String s: arr)
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
