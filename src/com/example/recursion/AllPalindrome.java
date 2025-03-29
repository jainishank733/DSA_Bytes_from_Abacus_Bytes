package com.example.recursion;

import java.util.ArrayList;
import java.util.Collections;

public class AllPalindrome {

    public static void main(String[] args) {
//        bruteForcePartitionPalindrome("abc");

        genAllPalindrome("nitin", "");

    }

    private static void bruteForcePartitionPalindrome(String inp) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<inp.length(); i++){
            for(int j=i; j<inp.length(); j++){
                if(checkPalindrome(inp.substring(i, j+1))){
                    arr.add(inp.substring(i, j+1));
                }
            }
        }
        arr.forEach(System.out::println);
    }

    private static boolean checkPalindrome(String substring) {
        int l = 0, r = substring.length()-1;
        while(l<r){
            if(substring.charAt(l) != substring.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void genAllPalindrome(String inp, String out){
        if(inp.length() == 0){
            System.out.println(out);
            return;
        }
        for(int i=1; i<=inp.length(); i++){
            if(checkPalindrome(inp.substring(0, i)))
                genAllPalindrome(inp.substring(i), out+inp.substring(0, i)+" | ");
        }
    }

}
