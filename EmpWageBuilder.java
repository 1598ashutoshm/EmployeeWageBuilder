package EmpWageBuilder;

public class EmpWageBuilder {
	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME= 2;
	
	public final String Company;
	public final int EmpRatePerHr;
	public final int NumofWorkingDays;
	public final int MaxHoursPerMonth;
	
	public EmpWageBuilder(String Company, int EmpRatePerHr, int NumofWorkingDays, int MaxHoursPerMonth)
	{
		this.Company=Company;
		this.EmpRatePerHr=EmpRatePerHr;
		this.NumofWorkingDays=NumofWorkingDays;
		this.MaxHoursPerMonth=MaxHoursPerMonth;
	}
	
	public void CalcEmpWageForDmart()
	{
		int salary,emphrs=0,totalworkinghours=0,totalworkingdays=0;
		while (totalworkingdays<this.NumofWorkingDays && totalworkinghours<this.MaxHoursPerMonth)
		{
			totalworkingdays=totalworkingdays+1;
			int empCheck =(int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) 
			{
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
		     salary=this.EmpRatePerHr * totalworkinghours;
		     System.out.println("Total Wage For Company: " +this.Company +" " + " is: "+ salary);
	}
	
	public void CalcEmpWageForReliance()
	{
		int salary,emphrs=0,totalworkinghours=0,totalworkingdays=0;
		while (totalworkingdays<this.NumofWorkingDays && totalworkinghours<this.MaxHoursPerMonth)
		{
			totalworkingdays=totalworkingdays+1;
			int empCheck =(int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) 
			{
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
		     salary=this.EmpRatePerHr * totalworkinghours;
		     System.out.println("Total Wage For Company: " +this.Company +" " + " is: "+ salary);
	}

	public static void main(String[] args) {
		
		EmpWageBuilder dmart = new EmpWageBuilder("DMART",20,2,10);
		dmart.CalcEmpWageForDmart();
		EmpWageBuilder reliance = new EmpWageBuilder("Reliance",10,4,20);
		reliance.CalcEmpWageForReliance();
				
	}
}
