public class EvenNumbers {

    public static void main(String[] args) {

        int sum = 0;

        for(int i = 0; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("\nThe sum is: " + sum);
    }
}
