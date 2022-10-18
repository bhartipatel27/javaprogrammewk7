package javaprogrammewk7;
/*
Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales Commission
 */

import java.util.Scanner;

public class Programme7 {

    static int salesID, salesAmount, basicSalary;
    static double commission;
    static String sellersname;

    public static void main(String[] args) {
        input();

    }

    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Sales ID:");
        salesID = scanner.nextInt();
        System.out.println("Enter Saller's Name:");
        sellersname = scanner.next();
        System.out.print("Enter sales amount:");
        salesAmount = scanner.nextInt();
        System.out.print("Enter Basic Salary:");
        basicSalary = scanner.nextInt();
        if (salesAmount > 5000) {
            commission = (salesAmount * 35) / 100;
            System.out.println("Salers@s commision is :" + commission);
        } else if (salesAmount > 30000) {

            commission = (salesAmount * 20) / 100;
            System.out.println("Salers's commision is:" + commission);


        } else if (salesAmount >= 20000) {
            commission = (salesAmount * 10) / 100;
            System.out.println("Salers's commision is:" + commission);

        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100;
            System.out.println("Salers's commision is:" + commission);
        } else {

            commission = (salesAmount * 2) / 100;
            System.out.println("Salers's commision is:" + commission);
        }
    }
}
