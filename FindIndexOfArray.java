import java.util.Scanner;

public class FindIndexOfArray {
    public static void main(String[] args) {
            int arr[] = {1,2,3,4,5};
            int number;
            System.out.println("Enter Number between 1 to 5");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();

            for(int i=0; i< arr.length;i++){
                if (arr[i] == number){
                    System.out.println("Number Found at index:"+ i);
                }
            }
    }
}
