
public class EmpWageBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int IS_FULL_TIME = 1;
		int IS_PART_TIME= 2;
		int salary,emphrs;
		int EMP_RATE_PER_HR = 20;
		
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
            
		
		salary=EMP_RATE_PER_HR * emphrs;
		System.out.print(salary);
		
		
	}
}
