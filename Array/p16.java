package Array;

public class p16 {
    public static void main(String args[]){
        int arr[] = {9,6,3,14,5};
        System.out.println(findLargest(arr));
    }

    private static int findLargest(int[] arr) {
        int largest = arr[0];

        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        return largest;
    }
}
