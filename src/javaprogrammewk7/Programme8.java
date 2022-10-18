package javaprogrammewk7;
/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Programme8 {

    static char city;

    public static void main(String[] args) {
        cityname();
    }

    public static void cityname() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any letter between A to F");
        city = scanner.next().charAt(0);
        if (city == 'a' || city == 'A') {
            System.out.println("Agra");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Bhuj");
        } else if (city == 'C' || city == 'c') {
            System.out.println("Chennai");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Diu");
        } else if (city == 'E' || city == 'e') {
            System.out.println("East London");
        } else if (city == 'F' || city == 'f') {
            System.out.println("Firozabad");
        } else {
            System.out.println("Invalid Entry");
        }
    }
}