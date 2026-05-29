class Bank    
{
    int balance;
    public void checkBalance()
    {
        System.out.println("Balance is:" + balance);
    }
}
class Customer extends Bank
{
    public void deposit(int amount)
    {
        if(amount > 0)
        {
            balance = balance + amount;
            System.out.println("Amount deposited" + amount);
        }
    }
    public void withdraw(int amount)
    {
        if(amount > 0 && amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Amount withdrawn" + amount);
        }
        else
        {
            System.out.println("Insufficient funds");
        }
    }
}
class BankManagement
{
    public static void main(String arg[])
    {
        Customer c = new Customer();
        c.deposit(1000);
        c.checkBalance();
        c.withdraw(500);
        c.checkBalance();
    }
}
