import java.util.*;

class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original = n;
        n = Math.abs(n);

        //12345
        //54321

        int result = 0;
        while(n != 0){
            //12345,1234,123,12,1

            int rem = n % 10;
            // 5,4,3,2,1

            result = result * 10 + rem;
            //5,54,543,5432,54321

            n /= 10;
            // 1234,123,12,1,0
        }

        if(original < 0){
            result = -result;
        }

        System.out.println(result);
    }
}
