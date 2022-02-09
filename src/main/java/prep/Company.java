package prep;
import java.util.ArrayList;

public class Company
{
	public ArrayList<Employee> employees = new ArrayList<Employee>(); 
	
	public ArrayList<Double> pay(ArrayList<Employee> employees)
	{
		int numEmployee = employees.size();
		ArrayList<Double> payment = new ArrayList<Double>();
		for (int i = 0; i < numEmployee; i++)
		{
			payment.add(employees.get(i).performPay());
		}
		return payment;
	}
	
	public ArrayList<Double> pay()
	{
		return pay(employees);
	}
	
	public void addEmployee(String name, double rate)
	{
		employees.add(new Employee(name, rate));
	}
	
	public void addEmployee(Employee A)
	{
		employees.add(A);
	}
}
