public class Bank 
{
	private int balance;
	public void deposit(int amount)
	{
		balance = balance + amount;
	}
	public int getbalance()
	{
		return balance;
	}
	public static void main(String arg[])
	{
		Bank c = new Bank();
		c.deposit(60000);
		System.out.println(c.getbalance());		
	}
}
