package EmployeeWageBuilder;


public class EmpWageBuilder {
	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME= 2;
	public static final int NO_OF_WORKING_DAYS=2;
	public static final int EMP_RATE_PER_HR = 20;
	public static final int MAX_HRS_IN_MONTH=10;
	
	public static void CalcEmpWage()
	{
		int salary,emphrs;
		int totalworkinghours=0;
		int totalworkingdays=0;
		
		while (totalworkingdays<NO_OF_WORKING_DAYS && totalworkinghours<MAX_HRS_IN_MONTH)
		{
			totalworkingdays=totalworkingdays+1;
			double empCheck = Math.floor(Math.random() * 10) % 3;
			int empcheck =(int)empCheck;
			switch (empcheck) {
		    case IS_FULL_TIME:
		    	emphrs=8;
		    	break;
		    case IS_PART_TIME:
		    	emphrs=4;
		    	break;
		    default:
		    	emphrs=0;
		    	break;
		    }
			totalworkinghours= totalworkinghours + emphrs;
	        System.out.println("Day#: " + totalworkingdays + " Emp hr" + emphrs);
		}
		salary=EMP_RATE_PER_HR * totalworkinghours;
		System.out.print("Total Wage: "+ salary);
	}

	public static void main(String[] args) {
		
		EmpWageBuilder.CalcEmpWage();

				
	}
}
