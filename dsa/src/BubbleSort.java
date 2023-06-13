import java.util.*;
import java.util.Arrays;

public class BubbleSort {
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
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    //function for bubble sort
    static void bubble(int arr[]){
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            //for each step, max item will come at the last index
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                    //swap
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }

            }

        }
    }
}
