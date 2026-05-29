class Encapsulation 
{
	private int id;
	public void setid(int id)
	{
		this.id = id;
	}
	public int getid()
	{
		return id;
	}
}
class Student
{
	public static void main(String arg[])
	{
		Encapsulation ens = new Encapsulation();
		ens.setid(98);
		ens.getid();
	}
}
