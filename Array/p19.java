package Array;

import java.util.Arrays;

public class p19 {

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        copyArray(arr);


    }

    private static void copyArray(int[] org) {
        
        //method 1 using forloop
        // int[] copy = new int[org.length];
        // for(int i = 0; i<org.length; i++){
        //     copy[i] = org[i];
        // }
        // System.out.println(Arrays.toString(copy));


        // method 2 using arraycopy
        // int[] copy = new int[org.length];
        // System.arraycopy(org, 0, copy, 0, org.length);
        // System.out.println(Arrays.toString(copy));

        // method 3 using array.copyof()
        // int[] copy = Arrays.copyOf(org, org.length);
        // System.out.println(Arrays.toString(copy));

        // method 4 Arrays.copyofRange()
        // int[] copy = Arrays.copyOfRange(org, 0, org.length);
        // System.out.println(Arrays.toString(copy));

        // method 5 using clone()
        int[] copy = org.clone();
        System.out.println(Arrays.toString(copy));



        
        
    }
    
}
