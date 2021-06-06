package ex22;

/*

*  UCF COP3330 Summer 2021 Assignment 1 Solution
*  Copyright 2021 Jeyler Zabala

Exercise 22 - Comparing Numbers
Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

Write a program that asks for three numbers. Check first to see that all numbers are different.
If they’re not different, then exit the program. Otherwise, display the largest number of the three.

Example Output
Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.

Constraint
Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.

Challenges
Modify the program so that all entered values are tracked and the user is prevented from
entering a number that’s already been entered.
Modify the program so that it asks for ten numbers instead of three.
Modify the program so that it asks for an unlimited number of numbers.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int number1, number2, number3, largestNumber;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        number2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        number3 = sc.nextInt();

        if ((number1 == number2) || (number1 == number3) || (number2 == number3)) {
            System.out.println("Input is not valid.");
            System.exit(0);
        }

        if ((number1 > number2) && (number1 > number3)) {
            largestNumber = number1;
        }
        else if ((number2 > number1) && (number2 > number3)) {
            largestNumber = number2;
        }
        else if ((number3 > number1) && (number3 > number2)) {
            largestNumber = number3;
        }
        System.out.println("The largest number is " + largestNumber + ".");


    }
}
