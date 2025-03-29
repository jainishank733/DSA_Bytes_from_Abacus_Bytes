package com.example.recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(numberOfWaysToClimbStairs(5));
    }

    private static int numberOfWaysToClimbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return ways(dp, n);

    }

    private static int ways(int[] dp, int n) {
        // base condition
        if(n == 0 || n == 1){
            return dp[n] = 1;
        }

        // main work
        if(dp[n] != -1){
            return dp[n];
        }

        // recursive work
        return dp[n] = ways(dp, n-1) + ways(dp, n-2);

    }

}
