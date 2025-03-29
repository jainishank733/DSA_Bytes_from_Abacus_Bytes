package com.example.recursion;

public class GenAllSubsequence {

    public static void genS(String inp, String out){
        if(inp.length() == 0){
            System.out.println(out);
            return;
        }
        genS(inp.substring(1), out);
        genS(inp.substring(1), out+inp.charAt(0));

    }

    public static void main(String[] args) {
        genS("abc", "");
    }

}
