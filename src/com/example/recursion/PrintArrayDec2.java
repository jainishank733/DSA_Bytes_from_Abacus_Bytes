package com.example.recursion;

public class PrintArrayDec2 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        printArrayDec(arr, 0, 4);
    }

    private static void printArrayDec(int[] arr, int i, int n) {
        if(i >n){
            return;
        }
        printArrayDec(arr, i+1, n);
        System.out.println(arr[i]);
    }

}
