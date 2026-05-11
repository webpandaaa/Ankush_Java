package Array;

import java.util.Arrays;

public class p20 {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        reverse(arr);
    }

    // method 1 using for loop
    // public static void reverse(int[] arr){
    //     for(int i = arr.length-1; i>=0; i--) {
    //         System.out.print(arr[i] + " ");
    //     }
    // }


    // method 2 using while loop
    public static void reverse(int[] arr){
       int left = 0;
       int right = arr.length-1;
       while(left<right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right]= temp;
        left++;
        right--;
       }

       System.out.println(Arrays.toString(arr));
    }

}
