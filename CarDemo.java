import java.util.*;

/**
 * This is the demo class for Car.
 *
 */

public class CarDemo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Choose between \n1. Sedan \nor \n2. Coupe");
		int choice = input.nextInt();
		if (choice = 1)
		{
			Car newCar1 = new Sedan();
			newCar1.doors();
			newCar1.make()
			newCar1.model();
			newCar1.year();
		}
		else if (choice = 2)
                {
                        Car newCar1 = new Coupe();
                        newCar1.doors();
                        newCar1.make()
                        newCar1.model();
                        newCar1.year();
                }
	}
}
