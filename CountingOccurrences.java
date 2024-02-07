import java.util.Scanner;
public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sequence: ");
        int n = sc.nextInt();
        System.out.println("Enter item to be found: ");
        int item = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == item) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("count: " +count);
        
    }
}
