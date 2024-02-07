import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int ans = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Type X or x to exit calc.");
            System.out.println("Enter the operator: ");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '/' || op == '*' || op == '%') {
                System.out.println("Enter 2 numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;

                }
                if (op == '/') {
                    ans = num1 / num2;

                }
                if (op == '*') {
                    ans = num1 * num2;

                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation!");
            }
            System.out.println(ans);
        }
    }
}