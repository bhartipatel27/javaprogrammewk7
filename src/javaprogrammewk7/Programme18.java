package javaprogrammewk7;
/*
Write a Java program to sum values of an array.
 */
public class Programme18 {
    public static void main(String[] args) {
sum();

    }
    public static void sum(){

        int [] arr = new int [] {6,7,8,9,10};
        int sum = 0;
        for (int i :arr)
            sum += i;
        System.out.println("The sum is :" +sum);
    }
}
