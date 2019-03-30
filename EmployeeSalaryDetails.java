
class EmployeeSalaryDetails
{
	private int id;
	private String name;
	private double monthlyBasic;

	EmployeeSalaryDetails(int empId,String empName,double empMonthlyBasic)
	{
		this.id = empId;
		this.name = empName;
		this.monthlyBasic = empMonthlyBasic;
	}
	double HRA=(50*monthlyBasic)/100;
	int medicalAllowance=1250;
	int conveyanceAllownace=800;
	double PF=0.0;
	double ESIC=0.0;
	double professionalTax;
	
	public double getAnnualBasic()
	{
		return (12 * monthlyBasic);
	}
	public double getMonthlyGrossSalary()
	{
		return (monthlyBasic+HRA+medicalAllowance+conveyanceAllownace);
	}
	public double getAnnualGrossSalary()
	{
		return (getMonthlyGrossSalary()*12);
	}

	public  double getMonthlyDeductions()
	{
		if(monthlyBasic<=6500)
		{
			PF=0.0;
		}
		else
		{ 
			PF = (monthlyBasic*10)/100;
		}
		if(monthlyBasic<=5000)
		{
			ESIC = (monthlyBasic*4.75)/100;
		}
		else
		{ 
			ESIC = 0.0;
		}
		if(getMonthlyGrossSalary()<=10000)
		{
			professionalTax = 50;
		}
		else
		{ 
			professionalTax = 1000;
		}
		return (PF+ESIC+professionalTax) ;
	}
	public double getMonthlyTakeHome()
	{
		
		return (getMonthlyGrossSalary()-getMonthlyDeductions());
	}
	public void getAnnuallyTakeHome()
	{
		System.out.println("Annual Take Home of the Employee is " +(getMonthlyTakeHome()*12));
	}

	public void display()
	{
		System.out.println("Employee id is \t" +id);
		System.out.println("Employee name is \t" +name);
		System.out.println("Emplyee monthly basic is \t" +monthlyBasic);
		System.out.println("Annual Basic of the employee is " +(getAnnualBasic()));
		System.out.println("Monthly Gross Salary of the Employee is " +(getMonthlyGrossSalary()));
		System.out.println("Annual Gross Salary of the Employee is " +(getAnnualGrossSalary()));
		System.out.println("Monthly Deduction of the Employee is " +(getMonthlyDeductions()));
		System.out.println("Monthly Take Home of the Employee is " +(getMonthlyTakeHome()));	
	}



}
