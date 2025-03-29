package com.example.recursion;

public class PrintDec {

    public static void main(String[] args) {
        printDec(10);
    }

    private static void printDec(int i) {
        if(i == 0)
            return;
        System.out.println(i);
        printDec(i-1);
    }

}
