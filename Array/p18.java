package Array;

public class p18 {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        countEvenOdd(arr);
    }

    private static void countEvenOdd(int[] arr) {
        int odd = 0;
        int even = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 1 || arr[i] % 2 != 0){
                odd++;
            }else{
                even++;
            }
        }

        System.out.println("even is : " + even + " odd is " + odd );
    }
    
};
