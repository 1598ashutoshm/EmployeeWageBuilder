
public class EmpWageBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int IS_FULL_TIME = 1;
		int IS_PART_TIME= 2;
		int salary,emphrs;
		int EMP_RATE_PER_HR = 20;
		
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == IS_FULL_TIME)
			emphrs=8;
		else if (empCheck == IS_PART_TIME)
			emphrs=4;
		else
		    emphrs=0;
		
		salary=EMP_RATE_PER_HR * emphrs;
		System.out.print(salary);
		
		
	}
}
