public class Encapsulation 
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
	public static void main(String arg[])
	{
		Encapsulation ens = new Encapsulation();
		ens.setid(97);
		System.out.println(ens.getid());
	}
}