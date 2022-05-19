import java.util.Scanner;

public class BinarySearch {
 //{1, 2, 3, 4, 5}; 
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            BinarySearch obj = new BinarySearch();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }                         
            System.out.println("found target at index " + obj.findTarget(arr, 4));
        }
    }

public int findTarget(int[] arr, int target) {
    int startIndex = 0;
    int endIndex = arr.length - 1;
    while(startIndex <= endIndex) {
        int midIndex = startIndex + (endIndex - startIndex) / 2;
        if(arr[midIndex] == target) {
            return midIndex;
        } 
        else if(arr[midIndex] > target) {
             endIndex = midIndex - 1;
        } 
        else {
            startIndex = midIndex + 1;
        }
    }
    return -1;
    
}}


