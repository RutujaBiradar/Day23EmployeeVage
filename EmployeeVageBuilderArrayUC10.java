public class EmployeeVageBuilderArrayUC10 {
         public static final int IsFullTime = 2;
         public static final int IsPartTime = 1;

	private int numOfCompany = 0;
	private CompanyEmpvage[] companyEmpvageArray;

	public EmployeeVageBuilderArrayUC10() {
	     companyEmpVageArray = new CompanyEmpVage[5];

        private void addCompanyEmpVage(String company,int empRatePerHour,int NumOfWorkingDays,int MaxHrsInMonth) {
         	companyEmpVageArray[numOfCompany] = new companyEmpVage(company,empRatePerHour,NumOfWorkingDays,MaxHrsInMonth);
	        numOfCompany++;
   }
}
private void computeEmpVage() {
   for(int i = 0; i < numOfCompany; i++){
	companyEmpVageArray[i].setTotalEmpVage(this.computeEmpVage(companyEmpVageArray[i]));
	System.out.println(companyEmpVageArray[i]);
	}
}

 private int computeEmpVage(CompanyEmpVage companyEmpVage){
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
      return  totalEmpHrs * companyEmpVage.empRatePerHour;
}



public static void main(String[] args){
         EmployeeVageBuilderArrayUC10 empVageBuilderArray = new EmployeeVageBuilderArrayUC10();
         EmployeeVageBuilder.addCompanyEmpVage("Dmart",20,2,10);
         EmployeeVageBuilder.addCompanyEmpVage("Reliance",10,4,20);
         EmployeeVageBuilder.computeEmpVage(); 
 }
 public class CompanyEmpVage {

        public final String company;
        public final int empRatePerHour;
        public final int NumOfWorkingDays;
        public final int MaxHrsInMonth;
        public int totalEmpVage;


  public CompanyEmpVage(String company,int empRatePerHour,int NumOfWorkingDays,int MaxHrsInMonth) {
                this.company=company;
                this.empRatePerHour=empRatePerHour;
                this.NumOfWorkingDays=NumOfWorkingDays;
                this.MaxHrsInMonth=MaxHrsInMonth;
        }
public void setTotalEmpVage(int totalEmpVage) {
	this.totalEmpVage = totalEmpVage;


}
public String toString() {
    return "Total Emp Vage For Company: " +company+ "is: "+total>
}
        }

