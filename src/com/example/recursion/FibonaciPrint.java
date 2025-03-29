package com.example.recursion;

public class FibonaciPrint {

    public static void main(String[] args) {
        System.out.println(fib(7));
    }

    private static int fib(int i) {
        if(i == 0 || i == 1){
            return i;
        }
        return fib(i-1) + fib(i-2);
    }

}
