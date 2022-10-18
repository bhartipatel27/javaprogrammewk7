package javaprogrammewk7;
/*
Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class Programme17 {
    public static void main(String[] args) {

        numeric();
    }
        public static void numeric(){
            int[]num={6,4,9,5,3};
            String[]strings={"Riya","Jiya","Siya","Kiya"};
            Arrays.toString(num);
            Arrays.toString(strings);
            System.out.println(Arrays.toString(num));
            System.out.println(Arrays.toString(strings));
            Arrays.sort(num);
            Arrays.sort(strings);
            System.out.println(Arrays.toString(num));
            System.out.println(Arrays.toString(strings));


        }
    }


