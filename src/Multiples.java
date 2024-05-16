import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int countLimit;
        System.out.println("Enter count limit:");
        countLimit = myObj.nextInt();
        multiple35(countLimit);
    }

    private static void multiple35(int limit) {
        int count = 0;
        int i = 1;
        while (i <= limit) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy3 || divisibleBy5) {
                count ++;
            }
            i++;
        }
        System.out.println("There are " + count + " multiples of 3 or 5.");
    }
}
