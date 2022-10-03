import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tempF = 0;
        double tempC = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the temp in Celsius: ");
        tempC = in.nextDouble();

        tempF = (tempC * 1.8) + 32;

        System.out.println("With the temp of " + tempC + "Celsius, the temp in Fahrenheit is " + tempF );
    }
}