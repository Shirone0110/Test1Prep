package prep;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CompanyTest
{
	Company comp;
	ArrayList<Employee> test = new ArrayList<Employee>();
	Employee A;
	Employee B;

	@BeforeEach
	void setUp() throws Exception
	{
		comp = new Company();
		
		A = new Employee("Al", 10.0);
		B = new Employee("Br", 13.5);
		A.setHours(50);
		A.setPayBehavior(new Hourly());
		B.setHours(10);
		B.setPayBehavior(new Contract());
		test.add(A);
		test.add(B);
		
		comp.addEmployee(A);
		comp.addEmployee(B);
	}

	@Test
	void testAddEmployee() throws Exception
	{
		assertEquals(test, comp.employees);
	}

	@Test
	void testPay() throws Exception
	{
		ArrayList<Double> answer = new ArrayList<Double>();
		answer.add(550.0);
		answer.add(135.0);
		
		assertEquals(comp.pay(test), comp.pay());
		assertEquals(answer, comp.pay(test));
	}
}
