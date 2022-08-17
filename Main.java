import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int expLevel;
		System.out.println("************Salary Calculation**************");
		System.out.println("Please enter the experience level from 1 to 4");
		Scanner sc = new Scanner(System.in);
		try {
			expLevel =  sc.nextInt();
	
       	switch(expLevel) {
			case 1:
				EmployeeSalary empsal1 = new EmployeeSalary(1,7000f,5000f,2000f);
				System.out.println("The take home salary is : "+ empsal1.netSalaryCalculation());
				break;
			case 2:
				EmployeeSalary empsal2 = new EmployeeSalary(2,10000f,7000f,2500f);
				System.out.println("The take home salary is : "+ empsal2.netSalaryCalculation());
				break;
			case 3:
				EmployeeSalary empsal3 = new EmployeeSalary(1,12000f,9000f,3000f);
				System.out.println("The take home salary is : "+ empsal3.netSalaryCalculation());
				break;
			case 4:
				EmployeeSalary empsal4 = new EmployeeSalary(2,15000f,10000f,3500);
				System.out.println("The take home salary is : "+ empsal4.netSalaryCalculation());
				break;
			default:
				System.out.println("Please enter the correct experience level");
		}
		}
		catch(Exception e)
        {
			System.out.println("Please enter integer from 1 to 4");
			sc.close();
        }
		sc.close();
		 
	}

}
