public class Cycle
{
	private double numberOfWheel, weight;
	public Cycle(double numberOfWheel, double weight)
	{//values are going through this method first before going to the Cycle and toString next
		this.numberOfWheel=numberOfWheel;
		this.weight=weight;	
		System.out.println("number of wheel(s)="+this.numberOfWheel+
				" weight="+this.weight);
	}
	public Cycle()
	{
		this(100.0, 1000.0);
	}
	public String ToString()
	{
		return "Inside the ToString method we have: the number of wheels are \n"
				+this.numberOfWheel+" and the weight is "+this.weight;
	}
}