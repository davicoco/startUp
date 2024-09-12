import java.util.Scanner;

public class ReturnNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(turnToNegative(num));
    }

    public static int turnToNegative(int numC) {
        return -numC;
    }
}
