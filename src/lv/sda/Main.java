package lv.sda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the limit for counting fibonacci digits : ");
        int limit = scan.nextInt();

        int[] fibonacciArray = new int[limit];
        //create first 2 series elements
        fibonacciArray[0] = 1;
        fibonacciArray[1] = 1;

        //create the Fibonacci series and store it in an array
        for(int i=2; i < limit; i++){
            fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];
        }

        System.out.print("Enter the position you want: ");
        int getIndex = scan.nextInt();

        int result = (int) Array.get(fibonacciArray,getIndex);


        System.out.print("The number on position: " + getIndex + " is: " + result);

        //System.out.println("Fibonacci Series up to " + limit);
        //for(int i=0; i< limit; i++){
        //    System.out.print(fibonacciArray[i] + " ");
        //}
    }
}
