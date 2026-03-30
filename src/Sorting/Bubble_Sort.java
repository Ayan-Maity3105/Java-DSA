package Sorting;
public class Bubble_Sort {
    public static void bubble_sort(int[] arr) {

        // algorithm
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //print array elements
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        // given array
        int[] arr = {5, 18, 100, 6, 89, 1};

        bubble_sort(arr);
    }
}
