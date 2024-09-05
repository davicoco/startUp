import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(evenOrOdd2(num));
    }

    //min egna
    public static String evenOrOdd(int numC) {
        if (numC % 2 == 0) {
            return numC + " is even";
        } else
            return numC + " is odd";
    }

    // mindre kod lösning
    public static String evenOrOdd2(int numCC) {
        return (numCC % 2) != 0 ? "even" : "odd";
    }//variable = (condition) ? expressionTrue :  expressionFalse;
}
