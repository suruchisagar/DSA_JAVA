import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //taking array as an user input
        //taking size of an array
        System.out.println("Enter size of an array:");
        int size= sc.nextInt();
        System.out.println("Enter the elements of an array:");
        int nums[]= new int[size];
        for (int s = 0; s < size; s++) {
            nums[s]= sc.nextInt();

        }
        System.out.println("The given array is:");
        for (int i = 0; i < size; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("Enter the target element:");
        int target= sc.nextInt();
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    //search in array and return the index if item found otherwise return -1

    static int linearSearch(int[] arr, int target){
        if(arr.length==0) {
            return -1;
        }
        /* using enhanced for loop
        for(int element:arr){
            if(element==target){
                return element;
            }

        }*/
        for (int index = 0; index < arr.length; index++) {
            int element= arr[index];
            if(element==target){
                return index;
            }

        }
        return -1;
    }


}
