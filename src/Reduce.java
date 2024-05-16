import java.util.Scanner;
public class Reduce {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int startNum;
        System.out.println("Enter starting number:");
        startNum = myObj.nextInt();
        reduceToZero(startNum);
    }

    private static void reduceToZero(int startNum) {
        int steps = 0;
        while (startNum != 0) {
            if (startNum % 2 == 0) {
                startNum = startNum / 2;
            }
            else {
                startNum = startNum - 1;
            }
            steps ++;
        }
        System.out.println("It takes " + steps + " steps to reduce zero.");
    }
}
