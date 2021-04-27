
public class EmpWageBuilder {
	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME= 2;
	public static final int NO_OF_WORKING_DAYS=20;
	public static final int EMP_RATE_PER_HR = 2;
	public static final int max_hrs_in_months=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int salary,emphrs;
		int totalworkinghours=0;
		int totalworkingdays=0;
		
		while ((totalworkingdays<NO_OF_WORKING_DAYS) && (totalworkinghours<max_hrs_in_months))
		{
			totalworkingdays=totalworkingdays+1;
			double empCheck = Math.floor(Math.random() * 10) % 3;
			int empcheck =(int)empCheck;
			switch (empcheck) {
		    case 1:
		    	emphrs=8;
		    	break;
		    case 2:
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
		System.out.print(salary);		
	}
}
