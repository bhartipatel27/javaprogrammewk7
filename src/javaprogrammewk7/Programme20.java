package javaprogrammewk7;
/*
Write a Java program to test if an array contains a specific value.
 */
public class Programme20 {
    public static void main(String[] args) {
        int[] num = {5,6,7,8,9};
        int toFind = 3;
        boolean found = false;
        for (int n : num){
            if (n == toFind){
                found = true;
                break;
            }
        }
        if (found)
            System.out.println(toFind + "is found.");
        else
            System.out.println(toFind + " is not found");
    }
}
