import java.util.Scanner;

public class PrintNumberFromNto1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<=0){
            System.out.println(0);
            return;
        }

        for(int i=n;i>1;i--){
            System.out.print(i+" ");
        }

        System.out.println(1);
    }
}
