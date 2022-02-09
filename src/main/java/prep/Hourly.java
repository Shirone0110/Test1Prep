package prep;

public class Hourly extends PayBehavior
{

	@Override
	public double pay(int hours, double rate)
	{
		return rate * Math.min(hours, 40) + rate * 1.5 * Math.max(0, hours - 40);
	}

}
