
public class EmployeeSalary {
	
	int expLevel;
	float baseSalary;
	float BOA;
	float bonus;
	float PFAmount;
	float taxAmount;
	float netSalaryMonth;
	float grossSalaryMonth;
	
	public EmployeeSalary(int expLevel,float baseSalary, float BOA, float bonus)
	{
		this.expLevel = expLevel;
		this.baseSalary = baseSalary;
		this.BOA = BOA;
		this.bonus =  bonus;
	}
	
	public float netSalaryCalculation()
	{
		float grossSalaryYear;
		float netSalaryMonthBefTax;
		grossSalaryMonth = this.baseSalary+ this.BOA +this.bonus;
		this.PFAmount = this.baseSalary * 0.12f;
		netSalaryMonthBefTax = grossSalaryMonth - this.PFAmount;
		
		grossSalaryYear = grossSalaryMonth * 12;
		this.taxAmount = taxCalculation(grossSalaryYear,netSalaryMonthBefTax);
		netSalaryMonth = netSalaryMonthBefTax - this.taxAmount;
		return netSalaryMonth;
	}
	private float taxCalculation(float grossSalaryYear, float netSalaryMonthBefTax)
	{
		if(grossSalaryYear <= 25000)
			this.taxAmount = 0;
		else if((grossSalaryYear>25000) && (grossSalaryYear<=500000))
		{
			this.taxAmount = netSalaryMonthBefTax * 0.05f;
		}
		else if((grossSalaryYear>500000) && (grossSalaryYear<=750000))
		{
			this.taxAmount = netSalaryMonthBefTax * 0.10f;
		}
		else if((grossSalaryYear>750000) && (grossSalaryYear<1000000))
		{
			this.taxAmount = netSalaryMonthBefTax * 0.15f;
		}
		else if((grossSalaryYear>1000000) && (grossSalaryYear<1250000))
		{
			this.taxAmount = netSalaryMonthBefTax * 0.20f;
		}
		else if((grossSalaryYear>1250000) && (grossSalaryYear<1500000))
		{
			this.taxAmount = netSalaryMonthBefTax * 0.25f;
		}else
		{
			this.taxAmount = netSalaryMonthBefTax * 0.30f;
		}
			
		return this.taxAmount;
	}
}


