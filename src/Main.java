import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String trash = "";
        double tempF;
        double tempC;
        boolean done = false;
        do
        {

            Scanner in = new Scanner(System.in);

            System.out.print("Enter the temp in Celsius: ");
            tempC = in.nextDouble();

            tempF = (tempC * 1.8) + 32;

            System.out.println("With the temp of " + tempC + "Celsius, the temp in Fahrenheit is " + tempF);
            if(in.hasNextDouble())
            {
                tempC = in.nextDouble();
                in.nextLine();
                if(tempC >= 0 || tempC <= 100)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter the a value from the freezing point (0) to the boiling point (100) " + tempC);
                }
            }
            else
            {
                System.out.println("You said the temp was " + tempC + trash);
                System.out.println("Please enter a correct temp.");
                System.exit(0);
            }
            tempF = (tempC * 1.8) + 32;

            System.out.println("With the temp of " + tempC + "Celsius, the temp in Fahrenheit is " + tempF);
        } while(!done);
    }
}