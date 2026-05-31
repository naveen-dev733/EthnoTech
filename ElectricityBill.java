import java.util.*;
public class ElectricityBill 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total units consumed: ");
        int units = sc.nextInt();
        double finalBill = 0;
        if (units <= 250) 
	{
            finalBill = 0;
        } 
	else 
	{
            finalBill = ((units - 250) / 50) * 50;
        }
        System.out.println("Your total electricity bill amount is: Rs. " + finalBill);

        sc.close();
    }
}