import java.util.Scanner;

public class CountDigitNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==0){
            System.out.println(1);
            return;
        }

        int count = 0;
        while(n!=0){
            int rem = n%10;
            n/=10;
            count++;
        }

        System.out.println(count);
    }
}
