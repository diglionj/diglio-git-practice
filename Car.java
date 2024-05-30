import java.util.*;

//This is an abstract class for Car.

public abstract class Car
{
	public void make()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the make of your vehicle:");
		String make = input.nextLine();
	}
	public void model()
	{
		Scanner input = new Scanner(System.in);
                System.out.println("Please enter the model of your vehicle:");
                String model = input.nextLine();
	}
	public void year()
	{
		Scanner input = new Scanner(System.in);
                System.out.println("Please enter the year of your vehicle:");
                String year = input.nextLine();
	}
	public abstract void doors();
}
