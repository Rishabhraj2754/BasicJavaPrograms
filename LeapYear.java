import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter the year in 4 Digits:");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        if(year % 4 == 0)
        System.out.println("leap year");

        else
            System.out.println("Not a Leap Year");

    }
}
