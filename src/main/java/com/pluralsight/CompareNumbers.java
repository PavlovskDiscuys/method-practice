package com.pluralsight;
import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a Number: ");
        int firstInput = input.nextInt();

        System.out.println("Is the number even? ");
        System.out.println(isEven(firstInput));

        System.out.println("Is the number positive ");
        System.out.println(isPositive(firstInput));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPositive(double number) {
        return number >- 0;
    }

}
