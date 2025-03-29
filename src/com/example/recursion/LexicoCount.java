package com.example.recursion;

public class LexicoCount {

    public static void printLexico(int start, int end){
        if(start>end){
            return;
        }

        System.out.println(start);
        if(start == 0){
            start = 1;
        }

        int countDigit = 0;
        while(countDigit <= 9){
            printLexico(start*10 + countDigit, end);
            countDigit++;
        }
    }

    public static void main(String[] args) {
        printLexico(0, 1000);
    }

}
