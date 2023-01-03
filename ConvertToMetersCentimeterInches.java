import java.util.Scanner;

public class ConvertToMetersCentimeterInches
{
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Distance in km:");
        num = scanner.nextInt();
        int meters = num * 1000;
        int centimeters = num * 100000;
        double inches = num * 39370.079;
        System.out.println("Distance in Meters:" + meters);
        System.out.println("Distance in Centimeters:" + centimeters);
        System.out.println("Distance in Inches:" + inches);
    }
}
