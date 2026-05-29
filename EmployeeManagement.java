class Employee 
{
	String name;
	double salary;
	public void employeeDetails(String name,double salary)
	{
		this.name=name;
		this.salary = salary;
	}
	public void displayDetails()
	{
		System.out.println("name:" +name);
		System.out.println("salary:" +salary);
	}
}
class Manager Extends Employee
{
	String role;
	public void manager(String name,double salary,String role)
	{
		super(name,salary);
		this.role=role;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Role:"+role);
	}
}
class EmployeeManagement
{
	public static void main(String arg[])
	{
		Employee emp = new Employee("John",60000,"Full Stack Developer");
		emp.displayDetails();
	}
}

