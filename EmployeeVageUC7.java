public class EmployeeVageUC7 {
         public static final int IsFullTime = 2;
         public static final int IsPartTime = 1;
         public static final int EmpRatePerHour = 20;
         public static final int NumOfWorkingDays = 2;
         public static final int MaxHrsInMonth = 10;



         public static int computeEmpVage() {

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
        int totalEmpVage = totalEmpHrs * EmpRatePerHour;
	System.out.println("Total Emp Vage : " + totalEmpVage);
    	return totalEmpVage;
	}
	public static void main(String[] args){
		computeEmpVage();
     }
}



