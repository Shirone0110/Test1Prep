package prep;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest
{
	Employee A;
	Employee B;
	Employee C;
	
	@BeforeEach
	void setUp() throws Exception
	{
		A = new Employee("An", 7.25);
		B = new Employee("Bob", 12.5);
		C = new Employee("Car", 9.5);
		
		A.setPayBehavior(new Hourly());
		A.setHours(20);

		B.setPayBehavior(new Contract());
		B.setHours(10);

		C.setPayBehavior(new Salary());
		C.setHours(1024);
	}

	@Test
	void testPerformPay()
	{
		assertEquals(145.0, A.performPay());
		assertEquals(125.0, B.performPay());
		assertEquals(380.0, C.performPay());
		
		A.setHours(50);
		assertEquals(398.75, A.performPay());
	}
}
