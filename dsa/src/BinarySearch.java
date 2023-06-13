

import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        //taking array as user input
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size= sc.nextInt();
        System.out.println("Enter elements of an array:");
        int arr[]=new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("The given array is:");
        for (int s = 0; s < arr.length; s++) {
            System.out.println(arr[s]);
        }

        //applying binary search
        System.out.println("Enter target element:");
        int target= sc.nextInt();
        System.out.println(binarySearch(arr, target));
    }

    //function for binary search
    static int binarySearch(int arr[], int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            //find middle element
            int mid= start+ (end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;

    }
}
