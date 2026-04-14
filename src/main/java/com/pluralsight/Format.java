package com.pluralsight;
import  java.util.Scanner;

public class Format {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name: ");
        String first = input.nextLine();

        System.out.println("What is  your last name: ");
        String last = input.nextLine();

        System.out.println("Good morning.");
        System.out.println(formatName(first,last));
    }

    public static String formatName(String first, String last) {
        return last + ", " + first;
    }



}
