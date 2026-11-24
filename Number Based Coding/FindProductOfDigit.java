import java.util.Scanner;

public class FindProductOfDigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int mul = 1;

        while(n!=0){
            int rem = n%10;
            mul *= rem;
            n/=10;
        }

        System.out.println("Product =" +mul);
    }
}
