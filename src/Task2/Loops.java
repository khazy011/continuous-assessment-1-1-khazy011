package Task2;
/**
 * Task 2 is to implement a class with the implementation of printWords. 
 * The printWords method will print the same word based on the inputer parameter numberOfLoops.
 */
public class Loops {
	/**
	 * This function will take a parameter numberOfLoops that will print out the "words" based
	 * on the numberOfLoops value. I.E. If numberOfLoops is 9, it will print "words" 9 times.
	 * @param numberOfLoops	will print "words" based on this parameter.
	 */
	public void printWords(int numberOfLoops) {
		// 1. "words" will print out based on the parameter input.
		int i = 0;
		while (i < numberOfLoops)
		{
			System.out.println("words");
			//System.out.println((i + 1) + ": words");
			i++;
		}
	}
	
	public static void main(String[] args) {
		Loops loops = new Loops();
		
		loops.printWords(9);

	}

}
