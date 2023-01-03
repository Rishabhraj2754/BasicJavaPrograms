import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n, num1 = 0, num2 = 0, num3 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of n:");
        n = scanner.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= n; i++)
        {
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
            System.out.print(num1+" ");
        }


    }
}
