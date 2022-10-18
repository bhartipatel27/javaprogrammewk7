package javaprogrammewk7;
/*
Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class Programme1 {

    int num = 2;
    String a;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scanner.nextInt();

        String a = number % 2 == 0 ? "Even" : "odd";
        System.out.println(a);
    }

    public void number() {

        System.out.println(a);
    }
}
