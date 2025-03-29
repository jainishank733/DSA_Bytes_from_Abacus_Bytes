package com.example.recursion;

public class FirstOccurence {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int search = 3;
        int n = 5;

        System.out.println(sol(arr, 0, n, search));
    }

    private static int sol(int[] arr, int i, int n, int search) {
        // base condition
        if(i == n){
            return -1;
        }

        // main work
        if(arr[i] == search){
            return i;
        }

        // recursive work
        return sol(arr, i+1, n, search);
    }

}
