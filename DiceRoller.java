
public class DiceRoller 
{
	
	private String dexpr;

	
	public DiceRoller(String dexpr)
	{
		this.dexpr = dexpr;		
	}
	
	public void  display()
	{
		System.out.println("Dice Roller: " + this.dexpr);
	}
	private void parseDice(String d)
	{
		String temp = "";
		for(int i = 0; i < d.length(); i++)
		{
			if(d.charAt(i) != 'D')
			{
				temp = temp + d.charAt(i);
			}
			else
			{
				//number of dice
				System.out.println(temp);
				temp = "";
			}
		}
		//number of sides
		System.out.println(temp);
	}
	
	private void processExpression()
	{
		String temp = "";
		for(int i = 0; i < this.dexpr.length(); i++)
		{
			if(this.dexpr.charAt(i) != '+')
			{
				temp = temp + this.dexpr.charAt(i);
			}
			else
			{
				this.parseDice(temp);
				temp = "";
			}
		}
		this.parseDice(temp);
	}
	
	public int roll()
	{
		int sum = 0;
		//logic
		this.processExpression();
		return sum;
	}
	
	
}
