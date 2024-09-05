public class PowerOfTwo {
    public static void main(String[] args) {
        //printar vilka tal som går att höja med 2
        System.out.println(isPowerOfTwo(4));
    }
    //om siffran n gånger 2 är lika med 0 och n är större än 1.

    //dela n med 2 och return true

    //annars return false
    private static boolean isPowerOfTwo(int n) {
        while (n % 2 == 0 && n > 1) {
            n /= 2;
        }
        return (n == 1);
    }
}
