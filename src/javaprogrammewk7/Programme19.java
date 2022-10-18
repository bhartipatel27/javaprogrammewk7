package javaprogrammewk7;
/*
Write a Java program to calculate the average value of array elements.
 */

public class Programme19 {
    public static void main(String[] args) {
        average();
    }

    public static void average(){
        int [] arr =new int[] {5,10,15,20,25};
        int sum=0;
        for (int i=0; i<arr.length ; i++)
            sum = sum + arr[i];
        double average = sum / arr.length;
        System.out.println("Average value is : "+average);


    }
}

