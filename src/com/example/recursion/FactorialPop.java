package com.example.recursion;

public class FactorialPop {

    private static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*fact(n-1);  // Example of Tail Recursion
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }

}
