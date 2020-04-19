
package com.practice;
import java.util.*;
public class Sortedsquares {
    public static int[] sortedSquares(int[] A) {
        int[] arr=new int[A.length];
        for(int i=0;i<A.length;i++){
            arr[i]=A[i]*A[i];
        }
        Arrays.sort(arr);
        return arr;
    }


    public static void main(String args[]){
        int[] arr={-7,-3,2,3,11};
        int[] A=(sortedSquares(arr));
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
    }


}

//time complexity =O(nlogn)
//but for O(n) can be done using 2 pointers