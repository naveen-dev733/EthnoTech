import java.util.Scanner;
abstract class OrderFood 
{
    String customerName;
    int quantity;
    double price;
    OrderFood()
    {
        System.out.println("Welcome to our Food Ordering System");
    }
    OrderFood(String name, int quantity, double price)
    {
        this.customerName = name;
        this.quantity = quantity;
        this.price = price;
    }
    abstract void generateBill();
}
class FoodOrder extends OrderFood
{
    String itemName;
    FoodOrder(String name, String itemName, int quantity, double price) 
    {
        super(name, quantity, price);
        this.itemName = itemName;
    }
    @Override
    void generateBill() {
        double total = quantity * price;
        System.out.println("\n------ BILL ------");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Food Item     : " + itemName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price/Item    : " + price);
        System.out.println("Total Bill    : " + total);
        System.out.println("------------------");
    }
}
public class Main
{
    public static void main(String[] args) 	
    {
        Scanner sc = new Scanner(System.in);
        String[] items =
        {
            "Pizza", "Burger", "Pasta", "Sandwich", "Biryani",
            "Fried Rice", "Noodles", "Ice Cream", "Coffee", "Juice"
        };
        double[] prices = 
        {
            250, 120, 180, 100, 220,
            160, 140, 80, 60, 50
        };
        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();
        System.out.println("\nMenu:");
        for (int i = 0; i < items.length; i++) 
        {
            System.out.println((i + 1) + ". " + items[i] + " - $" + prices[i]);
        }
        System.out.print("\nSelect Item (1-10): ");
        int choice = sc.nextInt();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        if (choice >= 1 && choice <= 10) 
        {
            FoodOrder order = new FoodOrder
            (
                    customerName,
                    items[choice - 1],
                    quantity,
                    prices[choice - 1]
            );
            order.generateBill();
        } 
        else 
        {
            System.out.println("Invalid Item Selection!");
        }

        sc.close();
    }
}