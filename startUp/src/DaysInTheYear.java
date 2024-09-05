import java.util.Scanner;

public class DaysInTheYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        System.out.println(dagarPerAr(year));
    }

    private static String dagarPerAr(int yearC) {
        int daysInYear = isLeapYear(yearC) ? 366 : 365;
        return yearC + " har " + daysInYear + " dagar";
    }

    //&& är "OCH" operatorn
    //% hur många gånger ett tal kan delas med ett annat
    //|| är "ELLER" operatorn
    private static boolean isLeapYear(int yearCC) {
        return (yearCC % 4 == 0 && yearCC % 100 != 0) || yearCC % 400 == 0;
    }
}
