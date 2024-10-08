/**
 * 
 */
package ca1.task5;

/**
 * 
 */
public class Task5Snippet {
	/**
	 * This function takes a string input and returns a 
	 * new string after performing the following manipulation 
	 * on the input string.
	 * 
	 * @param input string for manipulation
	 * @return char array as a String object
	 */
    public static String decipher(String input) {
        // Step 1:
        String a = "";
		for (int i = input.length() - 1; i > 0; i--) {
			a += input.charAt(i);
		}
        
        // Step 2:
        String b = a
                .replaceAll("a", "1")
                .replaceAll("e", "2")
                .replaceAll("i", "3")
                .replaceAll("o", "4")
                .replaceAll("u", "5");

        // Step 3:
        char[] c = b.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int randomIndex = (int) (Math.random() * c.length);
            char temp = c[i];
            c[i] = c[randomIndex];
            c[randomIndex] = temp;
        }

        // Step 4: 
        return new String(c);
    }

    public static void main(String[] args) {
        String mysteryInput = "sleuth";
        String mysteriousOutput = decipher(mysteryInput);
        System.out.println("The cryptic result: " + mysteriousOutput);
    }
	
	/**
	 * Q: What does the decipher() method do? explain the code below. 
	 * NOTE: You may find it useful to refer to either Line numbers or the various steps marked within the code.
	 *
	 * A: 
	 * This function takes a string input and returns a 
	 * new string after performing the following manipulation 
	 * on the input string.
	 * 
	 * Step 1: Takes the string input and then assigns the string in reverse to variable String a
	 * 
	 * Step 2: Replaces vowels found in string a with numbers and then assigned to String variable b:
	 * 		   * a -> 1
	 * 		   * e -> 2
	 * 		   * i -> 3
	 * 		   * o -> 4
	 * 		   * u -> 5
	 * 
	 * Step 3: Converts variable String b into a Char Array and then assigned to variable Char[] c.
	 * Within the for loop the a random index is generated and explicit cast is applied when assigning to
	 * variable randomIndex.
	 * 
	 * The current value is stored in a char variable called temp. The values are then swapped with the value
	 * based on the randomIndex position and then the value that is stored in temp is assigned to the position of
	 * the randomIndex position.
	 * 
	 * Step 4: This step returns the variable c which is Array of char as a new String object to the caller of
	 * the function.
	 */ 

}
