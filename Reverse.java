import  java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int newNum = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            newNum = newNum*10+rem;
        }
        System.out.println(newNum);

    }
}
