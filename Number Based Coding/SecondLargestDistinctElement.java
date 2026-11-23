public class SecondLargestDistinctElement {
    public static void main(String args[]){
        int arr[] = {10,25,5,40,15};
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        boolean hasSecondLargest = false;

        if(n==0){
            System.out.println("Array is empty!");
            return;
        }

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
                hasSecondLargest = true;
            }
            else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest = arr[i];
                hasSecondLargest = true;
            }
        }

        System.out.println(largest);

        if(!hasSecondLargest){
            System.out.println("No Second Largest Element");
        }
        else{
            System.out.println(secondLargest);
        }
    }
}
