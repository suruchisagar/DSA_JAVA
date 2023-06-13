
import java.util.*;
public class InsertionSort {
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
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
