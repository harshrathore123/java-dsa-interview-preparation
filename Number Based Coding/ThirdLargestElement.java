public class ThirdLargestElement {
    public static void main(String args[]){
        int arr[] = {10,25,5,40,15};
        int n = arr.length;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        boolean hasThirdLargest = false;

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
                hasThirdLargest = true;
            }
            else if(arr[i]<largest && arr[i]>secondLargest){
                thirdLargest = secondLargest;
                secondLargest = arr[i];
                hasThirdLargest = true;
            }
            else if(arr[i]<secondLargest && arr[i]>thirdLargest){
                thirdLargest = arr[i];
                hasThirdLargest = true;
            }
        }

        if(hasThirdLargest){
            System.out.println("Third Largest Element: "+thirdLargest);
        }
        else{
            System.out.println("No Third Largest Element Found!");
        }
    }
}
