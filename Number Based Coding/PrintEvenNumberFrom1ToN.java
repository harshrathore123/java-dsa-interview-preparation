import java.util.Scanner;

public class PrintEvenNumberFrom1ToN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<=0){
            System.out.println(0);
            return;
        }

        for(int i=2;i<n;i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }

        if(n%2==0){
            System.out.println(n);
        }
    }
}
