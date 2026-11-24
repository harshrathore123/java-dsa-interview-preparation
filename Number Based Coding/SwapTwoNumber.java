import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("Before Swapping: " + " a = " + n + " , b = " + m);

        int temp = n;
        n = m;
        m = temp;

        System.out.println("After Swapping: " + " a = " + n + " , b = " + m);

    }
}
