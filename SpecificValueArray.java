import java.util.Scanner;

public class SpecificValueArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Enter Any Number");
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println("THE VALUE IS PRESENT");

            }

        }
        System.out.println("The Specific value not Present");

    }

}

