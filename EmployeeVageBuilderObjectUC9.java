public class EmployeeVageBuilderObjectUC9 {
         public static final int IsFullTime = 2;
         public static final int IsPartTime = 1;
	 
	private final String company;
	private final int empRatePerHour;
	private final int NumOfWorkingDays;
	private final int MaxHrsInMonth;
	private int totalEmpVage;



         public EmployeeVageBuilderObjectUC9(String company,int empRatePerHour,int NumOfWorkingDays,int MaxHrsInMonth) {
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.NumOfWorkingDays=NumOfWorkingDays;
		this.MaxHrsInMonth=MaxHrsInMonth;
	}

	public void computeEmpVage(){ 
             int empHrs = 0, totalWorkingDays = 0, totalEmpHrs = 0;

                while (totalEmpHrs < MaxHrsInMonth && totalWorkingDays < NumOfWorkingDays ){


                totalWorkingDays++;

                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
             switch (empCheck) {
                case IsFullTime :
                        empHrs  = 8;
                        break;
                case IsPartTime :
                        empHrs = 4;
                        break;
                default :
                        empHrs = 0;
         }
         totalEmpHrs += empHrs;
         System.out.println("Day#: "+ totalWorkingDays + "Emp Hr: "+empHrs);
      }
        totalEmpVage = totalEmpHrs * empRatePerHour;
}
public String toString() {
    return "Total Emp Vage For Company: " +company+ "is: "+totalEmpVage;
}


public static void main(String[] args){
         EmployeeVageBuilderObjectUC9 dmart = new EmployeeVageBuilderObjectUC9("DMart",20,2,10);
         EmployeeVageBuilderObjectUC9 reliance = new EmployeeVageBuilderObjectUC9("Reliance",10,4,20);
         dmart.computeEmpVage();
	 System.out.println(dmart);
	 reliance.computeEmpVage();
	 System.out.println(reliance);
}


}
