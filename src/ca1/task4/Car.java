package ca1.task4;

/**
 * This is for removing duplicates objects from an array. The Car class needs to have 
 * overridden methods, which are:
 * 	* toString() - where it must return a string value of “<Make>, <Model>, <Color>”.
 * 	* equals() - comparison of this object and another Car object.
 * 	* hashCode() - the hashCode must be a combination of the Model and Colour.
 *  
 * References:
 *  University of South Australia (UniSA) COMP 2033 - Week 1 - 1.3 - Debugging and Unit Testing, viewed 7th of October 2024, <https://uo.unisa.edu.au/course/view.php?id=3994&sectionid=406856>
 * 	University of South Australia (UniSA) COMP 2033 - Week 3 - 3.1 - Arrays, viewed 7th of October 2024, <https://uo.unisa.edu.au/course/view.php?id=3994&section=36>
 *  Sparke, G 2006, Chapter 9 - Arrays, The Java Way, Pearson Education Australia, Frenchs Forest NSW 2086 Australia, Malaysia, pp. 167 - 180
 *  Sparke, G 2006, Chapter 10 - Class Inheritance, The Java Way, Pearson Education Australia, Frenchs Forest NSW 2086 Australia, Malaysia, pp. 207 - 229
 */
public class Car {
	private String Make;
	private String Model;
	private String Colour;
	
	public Car(String Make, String Model, String Colour)
	{
		this.Make = Make;
		this.Model = Model;
		this.Colour = Colour;
	}
	
	@Override
	public String toString()
	{
		return this.Make + ", " + this.Model + ", " + this.Colour;
		
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Car car = (Car)obj;
		
		return this.hashCode() == car.hashCode();
		
	}
	
	@Override
	public int hashCode()
	{
		return (this.Model + this.Colour).hashCode();
	}
}