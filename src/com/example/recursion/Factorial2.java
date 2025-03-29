package com.example.recursion;

public class Factorial2 {



    private static void fact(int n, int ans){
        if(n == 0 || n == 1){ // base condition
            System.out.println(ans);
            return;
        }
        fact(n-1, ans*n);   // Example of Tail Recursion
    }

    public static void main(String[] args) {
        int n = 4, ans = 1;
        fact(n, ans);
    }

}
