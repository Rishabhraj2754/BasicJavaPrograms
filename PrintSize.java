import java.util.Scanner;

public class PrintSize {
    public static void main(String[] args) {
        System.out.println("Enter you Size 28 , 30 , 32 , 34 , 36");
        int size;
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        switch (size){
            case 28:
                System.out.println("Small Size");
                break;
            case 30:
                System.out.println("Medium Size");
                break;
            case 32:
                System.out.println("Lage Size");
            case 34:
                System.out.println("Extra Large");
                break;
            case 36:
                System.out.println("XXL");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
