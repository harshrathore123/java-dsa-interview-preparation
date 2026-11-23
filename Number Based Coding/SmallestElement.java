public class SmallestElement {
    public static void main(String args[]){
        int arr[] = {12,45,7,89,23};
        int n = arr.length;

        if(n == 0){
            System.out.println("Empty Array");
            return;
        }

        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }

        System.out.println(smallest);
    }
}
