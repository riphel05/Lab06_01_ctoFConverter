import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

<<<<<<< HEAD
=======
        String trash = "";
>>>>>>> 036817b (Initial commit)
        double tempF = 0;
        double tempC = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the temp in Celsius: ");
<<<<<<< HEAD
        tempC = in.nextDouble();

        tempF = (tempC * 1.8) + 32;

        System.out.println("With the temp of " + tempC + "Celsius, the temp in Fahrenheit is " + tempF );
=======
        if(in.hasNextDouble()) {
            tempC = in.nextDouble();
        }
        else
        {
            System.out.println("You said the temp was " + tempC + trash );
            System.out.println("Please enter a correct temp.");
            System.exit(0);
        }
        tempF = (tempC * 1.8) + 32;

        System.out.println("With the temp of " + tempC + "Celsius, the temp in Fahrenheit is " + tempF );

>>>>>>> 036817b (Initial commit)
    }
}