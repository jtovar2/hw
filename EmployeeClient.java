public class EmployeeClient
{
	public static void main(String[] args)
	{
		Lawyer lawyer = new Lawyer();
		SoftwareEngineer eng = new SoftwareEngineer();
		HarvardLawyer hardvardLawyer = new HarvardLawyer();

		printEmployee(lawyer);
		printEmployee(eng);
		printEmployee(hardvardLawyer);
	}

	public static void printEmployee(Employee employee)
	{
		System.out.println(employee.getClass().getSimpleName() + ":");
		System.out.println("Hours: " + employee.getHours());
		System.out.println("Salary: " + employee.getSalary());
		System.out.println("Vacation days: " + employee.getVacationDays());
		System.out.println("Vacation form: " + employee.getVacationForm());

		if(employee instanceof SoftwareEngineer)
		{
			SoftwareEngineer eng = (SoftwareEngineer) employee;
			eng.writeCode();
		}
	}
}