import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {

        String word = "halllååå";
        System.out.println(reverseWord(word));
    }

    public static String reverseWord(String wordC) {
        return new StringBuilder(wordC).reverse().toString();
    }


    public static String reverseWord2(String wordC) {
        String reversedWord = "";
        for (int i = wordC.length() - 1; i >= 0; i--) { //int i = wordC.length- 1; är sista bokstaven i Strängen
            reversedWord += wordC.charAt(i);            //i>=0; betyder om i är större eller lika med noll fortsätt gå till nästa tal från baklänges (i--;)
        }
        return reversedWord;
    }
}
