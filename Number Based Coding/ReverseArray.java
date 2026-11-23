import java.util.*;
public class ReverseArray {
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        int n = arr.length;

        int left = 0;
        int right = n-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
