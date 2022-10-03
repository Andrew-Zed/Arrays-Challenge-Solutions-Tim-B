package com.andrew.arrays;

import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter count:");
        
       findMin(readElement(readInteger()));


    }

    private static int readInteger(){
        int length = scanner.nextInt();
        scanner.nextLine();
        System.out.println("The length of array entered equals to " + length);
        return length;
    }

    private static int[] readElement(int length){
        int[] arr = new int[length];
        for(int i=0; i<arr.length; i++){
            System.out.println("Entered the value for index " + i );
            int a = scanner.nextInt();
            scanner.nextLine();
            arr[i] = a;
            System.out.println("array index " + i + " = " + arr[i]);
        }
        return arr;
    }

    private static int findMin(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The min value in the array is: " + min);
        return min;
    }
}
