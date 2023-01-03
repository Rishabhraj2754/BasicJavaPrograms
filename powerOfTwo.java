public class powerOfTwo {
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);;
        int base = 2;
        int result =1 ;
        for(int i=1; i<=n; i++) {
            result = result * base;


            System.out.println(i + " " + result);
        }


    }
}
