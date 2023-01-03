import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int number;
        System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        int count = 0;

        for(int i=2; i<=number/2; i++){
            if(number % i == 0) {

                System.out.println(number + " " + "Not a Prime Number");
                count++;
                break;
            }
        }
        if (count==0){
            System.out.println(number + " " + "Prime Number");
        }


    }
}
