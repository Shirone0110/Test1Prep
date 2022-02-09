package prep;

public class Salary extends PayBehavior
{

	@Override
	public double pay(int hours, double rate)
	{
		return rate * 40;
	}

}
