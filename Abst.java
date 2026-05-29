abstract class FoodOrder
{
    String customerName;
    int quantity;
    double price;

    FoodOrder()
    {
        System.out.println("Welcome to our food ordering system");
    }

    FoodOrder(String name, int quantity, double price)
    {
        this.customerName = name;
        this.quantity = quantity;
        this.price = price;
    }

    abstract void OrderFood();

    void generatedBill()
    {
        double total = quantity * price;

        System.out.println("Customer name: " + customerName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: " + price);
        System.out.println("Total Bill: " + total);
    }
}

class PizzaOrder extends FoodOrder
{
    PizzaOrder(String name, int quantity, double price)
    {
        super(name, quantity, price);
    }

    @Override
    void OrderFood()
    {
        System.out.println("Pizza order placed successfully");
    }
}

class Abst
{
    public static void main(String[] args)
    {
        PizzaOrder ord = new PizzaOrder("Krishna", 2, 100);

        ord.OrderFood();
        ord.generatedBill();
    }
}+