import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 0){
            System.out.println("Armstrong Number");
            return;
        }

        int count = 0;
        int actual_n = n;
        int orignal = n;

        while(n!=0){
            int rem = n%10;
            n/=10;
            count++;
        }
        int sum = 0;

        while(actual_n!=0){
            int rem = actual_n%10;
            int mul = 1;
            for(int i=0;i<count;i++){
                mul *= rem;
            }
            sum += mul;
            actual_n/=10;
        }

        if(orignal == sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }

    }
}
