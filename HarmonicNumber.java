import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the last Nth number for Harmonic number:" );
        Scanner scanner =new Scanner(System.in);
        num = scanner.nextInt();
        for(int i=1; i<=num; i++)
            System.out.println("1/"+i);

    }
}
