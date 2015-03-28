package nyc.c4q.jvvlives2005;

/**
 * Joshelyn Vivas
 *
 * Recap: Strings and loops

 Write a function uniqueCharacters which accepts as input a string S.
 Given the string S return a string S2 which contains all the distinct characters in S.
 The input string will only contain lowercase characters.
 The ordering of characters in the output string does not matter.

 Eg:
 abbcaabcaa --> abc
 apple --> aple or aepl
 microsoft --> microsft

 * Created by c4q-joshelynvivas on 3/27/15.
 */
import java.util.Scanner;

public class StringsLoops {
    public static String uniqueCharacters(String S) {          //Function

        String S2 = "";

        for (int i = 0; i < S.length(); i++) {                 //checking the String S
            boolean isSaved = false;
            for (int j = 0; j < S2.length(); j++) {
                if (S.charAt(i) == S2.charAt(j)) {             //if the input character matches with an identical character,
                    isSaved = true;                            //then stop    (ex: if bbb = character "b", then just get b)
                    break;
                }
            }
            if (!isSaved)                                      //if the input character doesn't match with other characters,
                S2 += S.charAt(i);                             //then continue (ex: if abc, and since a!=b and etc, then continue
        }
        return S2;                                             //give the new string with no repeated letters/characters
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type Something in Here:");
        System.out.println(uniqueCharacters(input.nextLine()));       ///***I WANT TO LOWERCASE THEM!!!****
    }
}