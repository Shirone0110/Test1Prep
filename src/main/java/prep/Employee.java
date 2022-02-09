package prep;

public class Employee
{
	private String name;
	private double pay_rate;
	private int hours;
	private PayBehavior pay_behavior;
	
	/**
	 * @param name
	 * @param pay_rate
	 * @param pay_behavior
	 */
	public Employee(String name, double pay_rate)
	{
		this.name = name;
		this.pay_rate = pay_rate;
	}

	/**
	 * @return the employee's name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * @return the employee's pay rate
	 */
	public double getPay_rate()
	{
		return pay_rate;
	}
	
	/**
	 * @param pay_rate the pay_rate to set
	 */
	public void setPay_rate(double pay_rate)
	{
		this.pay_rate = pay_rate;
	}
	
	/**
	 * @return the hours
	 */
	public int getHours()
	{
		return hours;
	}
	
	/**
	 * @param hours the hours to set
	 */
	public void setHours(int hours)
	{
		this.hours = hours;
	}
	
	/**
	 * @return the pay_behavior
	 */
	public PayBehavior getPayBehavior()
	{
		return pay_behavior;
	}
	
	/**
	 * @param pay_behavior the pay_behavior to set
	 */
	public void setPayBehavior(PayBehavior pay_behavior)
	{
		this.pay_behavior = pay_behavior;
	}
	
	public double performPay()
	{
		return pay_behavior.pay(hours, pay_rate);
	}
	
}
