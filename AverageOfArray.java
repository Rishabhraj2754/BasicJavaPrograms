public class AverageOfArray {
    public static void main(String[] args) {
        int arr[] ={5,5,5,5};
        int sum =0;

        for(int i=0; i< arr.length; i++){

            sum = sum + arr[i];

        }
        System.out.println(sum);
        int ave = sum / arr.length;
        System.out.println(ave);

    }
}
