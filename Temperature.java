class Temperature
{
	public static void main(String arg[])
	{
	    double[] temperatures = 
	    {
            	32.5, 34.0, 36.5, 38.0, 31.2, 33.4, 35.8, 37.2, 39.0, 30.5,
            	33.1, 36.0, 34.5, 35.2, 38.5, 39.2, 29.8, 31.0, 35.5, 36.8,
            	34.2, 33.0, 37.5, 36.1, 35.0, 32.8, 30.2, 34.9, 36.3, 38.1
	    };
	    double highest = temperatures[0];
	    double lowest = temperatures[0];
	    double sum = 0;
	    double count = 0;
	    for(double temp:temperatures)
	    {
		if(temp > highest)
		{
			highest = temp;
		}
		if(temp < lowest)
		{
			lowest = temp;
		}
		sum += temp;
		if(temp > 35.0)
		{
			count++;
		}
	    }
	    double average = sum / temperatures.length;
	    System.out.println("Highest Temperature: " + highest + "°C");
	    System.out.println("Average Temperature: " + String.format("%.2f", average) + "°C");
	    System.out.println("Lowest Temperature: " + lowest + "°C");
	    System.out.println("Number of Hot Days (>35°C): " + count);
	}
}


	