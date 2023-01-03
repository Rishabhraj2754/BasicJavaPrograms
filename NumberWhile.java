public class NumberWhile {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while(i <= 100){
            System.out.println(i);
            sum = sum + i;
            i++;
        }
        System.out.println("sum of first 100 numbers is: " + sum);
    }
}
