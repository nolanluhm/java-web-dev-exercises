package org.launchcode.java.studios.areaofacircle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        boolean isValidInput = false;
        double radius = 0;

        while (!isValidInput) {
            try {
                radius = input.nextDouble();
                if (radius < 0) {
                    System.out.print("Please enter a valid number: ");
                    input.nextDouble();
                    continue;
                }
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.print("Please enter a valid number: ");
                input.next();
            }
        }
        input.close();
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
