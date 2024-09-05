import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {
        String a = "asdfsfdsqwrtyuiopjkghdfsdfs";
        String b = "llkjljlkjljliuoiuou";

        System.out.println(longest(a,b));

        /*
        Sortera alla bokstäver i Strängarna a och b

        char[] array = (a + b).toCharArray();
        Arrays.sort(array);
        String sorted = new String(array);
        System.out.println(sorted);*/
    }


    //sorterar bokstäver och tar bort dubletter i strängarna a och b
    public static String longest(String a, String b) {
        String ab = a + b;
        return ab.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}
