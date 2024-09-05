public class TrueXorFalse {
    public static void main(String[] args) {
        /*
        false xor false == false
        true xor false == true
        false xor true == true
        true xor true == false
        */
// metoderna ger dessa värden
    }

    public static boolean xor(boolean a, boolean b){
        return a^b;//^ är en automatisk xor
    }

    public static boolean xor2(boolean a, boolean b) {
        if (a && b) {
            return false;
        }
        if (a || b) {
            return true;
        }
        return false;
    }
}
