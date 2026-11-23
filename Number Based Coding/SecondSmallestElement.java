public class SecondSmallestElement {
    public static void main(String args[]){
        int arr[] = {12,45,7,89,23};
        int n = arr.length;

        int Smallest = Integer.MAX_VALUE;
        int SecondSmallest = Integer.MAX_VALUE;
        boolean hasSecondSmallest = false;

        for(int i=0;i<n;i++){
            if(arr[i]<Smallest){
                SecondSmallest = Smallest;
                Smallest = arr[i];

                if(SecondSmallest != Integer.MAX_VALUE){
                    hasSecondSmallest = true;
                }
            }
            else if(arr[i]>Smallest && (!hasSecondSmallest ||arr[i]<SecondSmallest)){
                SecondSmallest = arr[i];
                hasSecondSmallest = true;
            }
        }

        System.out.println(Smallest);

        if (hasSecondSmallest) {
            System.out.println("Second Smallest: " + SecondSmallest);
        } else {
            System.out.println("No Second Smallest Element");
        }
    }
}
