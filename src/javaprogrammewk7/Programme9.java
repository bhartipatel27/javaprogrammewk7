package javaprogrammewk7;

import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
       cityname();
    }

    public static void cityname(){

        char city =10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any letter between A to F");
        city = scanner.next().charAt(0);
        switch (city){
            case 'a':
                System.out.println("Agra");
                break;
            case 'b':
                System.out.println("Bhuj");
                break;
            case 'c':
                System.out.println("Chennai");
                break;
            case 'd':
                System.out.println("Diu");
                break;
            case 'e':
                System.out.println("East London");
                break;
            case 'f':
                System.out.println("Firozabad");
                break;
            default:
                System.out.println("Invalid Entry");

        }

    }
}
