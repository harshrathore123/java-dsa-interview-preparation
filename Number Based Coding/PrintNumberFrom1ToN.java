import java.util.Scanner;

public class PrintNumberFrom1ToN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<=0){
            System.out.println(0);
            return;
        }

        for(int i=1;i<n;i++){
            System.out.print(i+" ");
        }

        System.out.println(n);
    }
}
