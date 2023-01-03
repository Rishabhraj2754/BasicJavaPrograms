import java.util.Scanner;

public class SquareAndCubeOfNumber {
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        num = scanner.nextInt();

        int square = num * num;
        int cube   = num * num * num;
        System.out.println("Square of the Number:" + square);
        System.out.println("Cube of the Number" + cube);
    }
}
