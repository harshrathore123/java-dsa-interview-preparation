public class FindLargestElement {
    public static void main(String args[]){
        int arr[] = {12,45,7,89,23};
        int n = arr.length;

        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        System.out.println(largest);
    }
}
