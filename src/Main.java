import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gallons;
        double efficiency;
        double price;
        double cost;
        double miles;

        System.out.print("The number of gallons of gas in the tank : ");

        if (in.hasNextDouble())
        {
            gallons = in.nextDouble();

            in.nextLine();

            System.out.print("The fuel efficiency in miles per gallon : ");

            if (in.hasNextDouble())
            {
                efficiency = in.nextDouble();

                in.nextLine();

                System.out.print("The price of gas per gallon : $");

                if (in.hasNextDouble())
                {
                    price = in.nextDouble();

                    in.nextLine();

                    miles = gallons * efficiency;

                    cost = gallons * price * 100.0 / miles;

                    System.out.println("Cost per 100 miles : $" + cost);

                    System.out.println("Miles the car can go with the gas in tank : " + miles);
                }

                else
                {
                    System.out.println("Input price of gas value is not valid");

                }

            }
            else
            {
                System.out.println("Input efficiency value is not valid");

            }

        }
        else
        {
            System.out.println("Input gallons value is not valid");

        }

    }

}