package prep;

public class Contract extends PayBehavior
{
	@Override
	public double pay(int hours, double rate)
	{
		return rate * hours;
	}

}
