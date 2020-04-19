package com.practice;

public class ArrayExplore_MaxConsecutiveOnes {


    public static int maxConsecutiveOnes(int[] nums){
        int count=0;
        int max_count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count+=1;

            }
            else{
                max_count=Math.max(count,max_count);
                count=0;
            }
        }
        return Math.max(count,max_count);




    }
    public static void main(String args[]){
        int[] arr={1,1,1,0,0,1,1,0,1,1,1,1,1,1};
        System.out.println(maxConsecutiveOnes(arr));
    }

}
