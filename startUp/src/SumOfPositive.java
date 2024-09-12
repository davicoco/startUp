import java.util.ArrayList;
import java.util.Arrays;

public class SumOfPositive {
    public static void main(String[] args) {
        ArrayList<Arrays> num = new ArrayList<>();

        int[] numbers = {6, 2, -3, -1, 8, 4};

        System.out.println(getSumOfPositiveNumbers2(numbers));
    }

    //foreach loop
    public static int getSumOfPositiveNumbers(int[] numbers) {
        int tot = 0;
        for (int i : numbers) {
            if (i > 0) {
                tot += i;
            }
        }
        return tot;
    }

    public static int getSumOfPositiveNumbers2(int[] numbers) {
        int tot = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.println(i);                      //KOM IHÅG ATT i ÄR PLATSEN I EN ARRAY OCH
                System.out.println(numbers[i]);             // numbers[i] ÄR SJÄLVA TALET I ARRAY
                tot += numbers[i];
            }
        }
        return tot;
    }

}