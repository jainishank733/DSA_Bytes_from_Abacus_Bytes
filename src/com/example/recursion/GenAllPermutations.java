package com.example.recursion;

public class GenAllPermutations {

    public static void genP(String s, String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        int n = s.length();
        for(int i=0; i<n; i++){
            genP(s.substring(0,i)+s.substring(i+1), ans+s.charAt(i));
        }
    }

    public static void main(String[] args) {
        genP("abc", "");
    }

}
