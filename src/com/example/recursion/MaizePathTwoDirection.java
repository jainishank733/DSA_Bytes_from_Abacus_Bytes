package com.example.recursion;

public class MaizePathTwoDirection {

    public static int maizePrint(int cr, int cc, int n, String path){
        if(cr>n || cc>n){
            return 0;
        }
        if(cr == n && cc == n){
            System.out.println(path);
            return 1;
        }

        return maizePrint(cr+1, cc, n, path+'D')+maizePrint(cr, cc+1, n, path+'R');

    }

    public static void main(String[] args) {
        System.out.println(maizePrint(0, 0, 3, ""));
    }

}
