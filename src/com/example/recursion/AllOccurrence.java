package com.example.recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AllOccurrence {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,6,2,9,5,3,2,0};
        int n = arr.length;
        int search = 2;
        int[] ans = sol(arr, 0, n, search, 0);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sol(int[] arr, int cur, int n, int search, int count) {
        if(cur == n){
            if(count == 0){
                return null;
            }
            int[] ans = new int[count];
            return ans;
        }
        if(arr[cur] == search){
            int[] ans = sol(arr, cur+1, n, search, count+1);
            ans[count] = cur;
            return ans;
        }else{
            int[] ans = sol(arr, cur+1, n, search, count);
            return ans;
        }
    }

}
