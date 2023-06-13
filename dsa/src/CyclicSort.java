import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {
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
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr){
        int i=0;
        while(i< arr.length){
            int index= arr[i]-1;
            if(arr[i]!= arr[index]){
                swap(arr,i,index);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
