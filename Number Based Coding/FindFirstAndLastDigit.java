import java.util.Scanner;

public class FindFirstAndLastDigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        n = Math.abs(n);

        int firstDigit = 0;
        int lastDigit = 0;

        lastDigit = n%10;

        while(n!=0){
            int rem = n%10;
            firstDigit = rem;
            n/=10;
        }

        System.out.println("First Digit = " +firstDigit);
        System.out.println("Last Digit = " +lastDigit);
    }
}
