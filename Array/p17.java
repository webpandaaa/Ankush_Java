package Array;

public class p17 {
    public static void main(String args[]){
        int arr[] = {9,6,3,14,5};
        System.out.println(findSmallest(arr));
    }

    private static int findSmallest(int[] arr) {
        int smallest = arr[0];

        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }

        return smallest;
    }
}
