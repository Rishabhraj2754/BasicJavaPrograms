import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter the Number to check Even or Odd");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
            if(number % 2 == 0) {
                System.out.println("IS a Even Number");
            }
            else {
                System.out.println("IS a Odd Number");
            }
    }
}
