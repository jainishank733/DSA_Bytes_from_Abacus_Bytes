package com.example.recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BoardPath {


    public static void main(String[] args) {
        System.out.println(boardpath(10));
    }

    public static int boardpath(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return ways(dp, n);
    }

    private static int ways(int[] dp, int n) {
        // base condition
        if(n == 0){
            return dp[0] = 1;
        }
        if(n<0){
            return 0;
        }

        // recursive work
        return ways(dp, n-1)+ways(dp, n-2)+ways(dp, n-3)+ways(dp, n-4)+ ways(dp, n-5)+ways(dp, n-6);

    }

}
