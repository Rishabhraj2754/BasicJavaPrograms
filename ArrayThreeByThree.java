import java.util.Scanner;

public class ArrayThreeByThree {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<3; i++ ){
            for(int j=0; j<3; j++){
                System.out.println("pls enter value for(" + i + ", " + j + "):");
                matrix[i][j] = scanner.nextInt();
            }
        }
            for(int i =0; i < 3; i++){
                for(int j =0 ; j < 3; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

    }
}
