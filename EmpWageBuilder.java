
public class EmpWageBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome To Employee Wage Computation");
		
		int IS_FULL_TIME = 1;
		int salary,emphrs;
		
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
		
		
	}
}
