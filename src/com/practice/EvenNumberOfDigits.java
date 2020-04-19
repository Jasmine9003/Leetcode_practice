package com.practice;

public class EvenNumberOfDigits {



    public static int findNumbers(int[] nums) {
if(nums.length==0 || nums==null){return 0;}

int fin_count=0;
        for(int i=0;i<nums.length;i++){
int count=0;
            while(nums[i]>0){
                nums[i]=nums[i]/10;
                count+=1;

            }
            if(count%2==0){
                fin_count+=1;
            }
        }
        return fin_count;
    }




    public static void main(String args[]){
        int[] arr={437,315,322,431,686,264,442};
        System.out.println(findNumbers(arr));
    }

}

