
public class EmpWageBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int IS_FULL_TIME = 1;
		int salary,emphrs;
		int EMP_RATE_PER_HR = 20;
		
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
			emphrs=8;
		else
			emphrs=0;
		
		salary=EMP_RATE_PER_HR * emphrs;
		System.out.println(salary);
		
		
	}
}
