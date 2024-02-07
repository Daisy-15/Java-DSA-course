import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        for (int i = 0; i <= limit; i++){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
