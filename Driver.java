
public class Driver 
{
	//remember - d.roll()
	public static void main(String[] args)
	{
		Dice d = new Dice(20);
		Dice d2 = new Dice(6);
		String diceString = "2D6+3D8+1D20";
		String roll1 =  diceString.substring(0,diceString.indexOf('+'));
		String holder = diceString.substring(diceString.indexOf('+')+1);
		String roll2 = holder.substring(0, holder.indexOf('+'));
		String roll3 = holder.substring(holder.indexOf('+')+1);
		
		System.out.println(diceString);
		System.out.println();
		System.out.println();



		String strnumOfDie1 = roll1.substring(0, roll1.indexOf("D"));
		String strsidesDie1 = roll1.substring(roll1.indexOf("D")+1);
		int numOfDie1 = Integer.parseInt(strnumOfDie1);
		int sidesDie1 = Integer.parseInt(strsidesDie1);
		Dice die1 = new Dice(sidesDie1);
		int ROLL1 = (die1.roll()*numOfDie1);
		
		String strnumOfDie2 = roll2.substring(0, roll2.indexOf("D"));
		String strsidesDie2 = roll2.substring(roll2.indexOf("D")+1);
		int numOfDie2 = Integer.parseInt(strnumOfDie2);
		int sidesDie2 = Integer.parseInt(strsidesDie2);
		Dice die2 = new Dice(sidesDie2);
		int ROLL2 = (die2.roll()*numOfDie2);
		
		String strnumOfDie3 = roll3.substring(0, roll3.indexOf("D"));
		String strsidesDie3 = roll3.substring(2,4);
		int numOfDie3 = Integer.parseInt(strnumOfDie3);
		int sidesDie3 = Integer.parseInt(strsidesDie3);
		Dice die3 = new Dice(sidesDie3);
		int ROLL3 = (die3.roll()*numOfDie3);
		
		int total = ROLL1+ROLL2+ROLL3;
		
		System.out.println("TOTAL OF ALL ROLLS:" + total);
	}
	
	

}
