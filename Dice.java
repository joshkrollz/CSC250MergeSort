import java.util.Random;

public class Dice 
{
	//Fields - variables owned by an instance of an object
	private int numSides;
	private String name;
	private Random r = new Random();
	
	public Dice(int numSides)
	{
		this.numSides = numSides;
		this.name = "D" + numSides;
	}
	
	public int roll()
	{
		
		
		return r.nextInt(this.numSides) + 1;
	}
}
