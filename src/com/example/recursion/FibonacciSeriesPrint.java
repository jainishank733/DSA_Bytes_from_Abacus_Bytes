package com.example.recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FibonacciSeriesPrint {

    private static int printFibonacciUtility(int[] dp, int n){
        if(n == 0 || n == 1){
            return dp[n] = n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = printFibonacciUtility(dp, n-1) + printFibonacciUtility(dp, n-2);
    }

    public static void printFibonacci(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        printFibonacciUtility(dp, n);
        for(int i=0; i<n+1; i++)
            System.out.print(dp[i]+" ");
        System.out.println();
    }



    public static void main(String[] args) {
        int n = 5;
        printFibonacci(n);
    }

}
