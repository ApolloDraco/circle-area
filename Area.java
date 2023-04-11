/* 
 *  Description: A Java Program for calculating the area of a circle of given radius.
*/

import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        int radius;
        final double PI = 3.14159;
        double area;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        radius = scanner.nextInt();

        if (radius <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }

        area = PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }
}
