import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int actual_n = n;
        int result = 0;

        while(n!=0){
            int rem = n % 10;
            result = result * 10 + rem;
            n /= 10;
        }

        if(actual_n == result){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
