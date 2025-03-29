package com.example.recursion;

public class ClimbStairs2 {


    public static void main(String[] args) {
        System.out.println(ways(5));
    }

    private static int ways(int n) {
        // base work
        if(n == 0 || n == 1){
            return 1;
        }
        // recursive work
        return ways(n-1) + ways(n-2);
    }

}
