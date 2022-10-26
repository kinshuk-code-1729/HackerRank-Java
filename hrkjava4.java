// Print the terms of given series :
// (a + 2^0.b),(a + 2^0.b + 2^1.b),...,(a + 2^0.b + 2^1.b +...+ 2^[n-1].b)
import java.util.Scanner;
public class hrkjava4 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res = a;
            for (int j = 0; j < n; j++)
            {
                res += (int)(Math.pow(2, j) * b);
                System.out.print(Integer.toString(res)  + ' ');
            }
            System.out.print('\n');
        }
        in.close();
    }
}
