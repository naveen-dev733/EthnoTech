class StudentList
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		java.util.ArrayList<String> student = new java.util.ArrayList<>();
		System.out.println("Enter the name of the first student:");
		String std1 = sc.nextLine();
		student.add(std1);
		System.out.println("Enter the name of the second student:");
		String std2 = sc.nextLine();
		student.add(std2);
		System.out.println("Enter the name of the third student:");
		String std3 = sc.nextLine();
		student.add(std3);
		System.out.println("Displaying the Student names list:");
		for(int i=0;i<stdent.size();i++)
		{
			System.out.println(student.get(i)+" ");
		}
	}
}
		