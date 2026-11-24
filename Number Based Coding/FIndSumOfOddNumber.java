import java.util.Scanner;

public class FIndSumOfOddNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<=0){
            System.out.println(0);
            return;
        }

        int sum = 0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
