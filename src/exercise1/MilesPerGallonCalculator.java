package exercise1;

import java.util.Scanner;

public class MilesPerGallonCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        double milesTraveled = input.nextDouble();

        System.out.println("How many gallons have you consumed?");
        double gallonsConsumed = input.nextDouble();
        input.close();

        double milesPerGallon = milesTraveled / gallonsConsumed;

        System.out.println("You are getting " + milesPerGallon + " miles per gallon.");
    }
}
