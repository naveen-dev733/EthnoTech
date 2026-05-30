class Fare
{
    public void calculateFare()
    {
        System.out.println("Calculating far for a ride...");
    }
}
class AutoFare extends Fare
{
    int distance = 2;
    int fareperkm = 90;
    public void calculateFare()
    { 
        System.out.println("Distance traveled by auto is:" + distance + "km");
        int totalFare = distance * fareperkm;
        System.out.println("Total fare for the auto ride is:" + totalFare);
    }
}
class CarFare extends Fare
{
    int distance = 2;
    int fareperkm = 125;
    public void calculateFare()
    {
        System.out.println("Distance travelled by car is:" + distance + "km");
        int totalFare = distance * fareperkm;
        System.out.println("Total fare for the car ride is:" + totalFare);
    }
}
class BikeFare extends Fare
{
    int distance = 2;
    int fareperkm = 40;
    public void calculateFare()
    {
        System.out.println("Distance travelled by bike is:" + distance + "km");
        int totalFare = distance * fareperkm;
        System.out.println("Total fare for the bike ride is:" + totalFare);
    }
}
public class FareCalculator
{
    public static void main(String arg[])
    {
        AutoFare autoFare = new AutoFare();
        CarFare carFare = new CarFare();
        BikeFare bikeFare = new BikeFare();
        bikeFare.calculateFare();
        autoFare.calculateFare();
        carFare.calculateFare();
        bikeFare.calculateFare();
    }
}