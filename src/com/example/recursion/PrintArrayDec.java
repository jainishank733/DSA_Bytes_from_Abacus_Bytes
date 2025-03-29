package com.example.recursion;

public class PrintArrayDec {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        printArrayDec(arr, 5);

    }

    private static void printArrayDec(int[] arr, int i) {
        if(i == -1){
            return;
        }
        System.out.println(arr[i]);
        printArrayDec(arr, i-1);

    }

}
