// Create a Java program that prints the multiplication table of a given number using a for loop.
package multiplication;

import java.util.Scanner;


public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        
        Scanner.close();
    }
}
