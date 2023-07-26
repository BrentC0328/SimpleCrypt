import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    private Character[] standardArray;
    private Character[] encryptArray;

    ROT13(Character cs, Character cf) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int startingIndex1 = alphabet.indexOf(cs);
        int loopAround1 = 0;

        this.standardArray = new Character[alphabet.length()];
        //Fill the array starting at the first character supplied.
        //When you go past z, loop back to beginning.
        for (int i = 0; i < alphabet.length(); i++){
            int loopingIndex = startingIndex1 + i;

            if (loopingIndex > alphabet.length() - 1){
                char tempLetter = alphabet.charAt(loopAround1);
                standardArray[i] = tempLetter;
                loopAround1++;
            } else {
                char tempLetter = alphabet.charAt(loopingIndex);
                standardArray[i] = tempLetter; }


        }
        int startingIndex2 = alphabet.indexOf(cf) - alphabet.indexOf(cs);
        int loopAround2 = 0;

        this.encryptArray = new Character[alphabet.length()];
        //Fill the array starting at the first character supplied.
        //When you go past z, loop back to beginning.
        for (int i = 0; i < alphabet.length(); i++){
            int loopingIndex = startingIndex2 + i;

            if (loopingIndex > alphabet.length() - 1){
                char tempLetter = alphabet.charAt(loopAround2);
                standardArray[i] = tempLetter;
                loopAround2++;
            } else {
                char tempLetter = alphabet.charAt(loopingIndex);
                standardArray[i] = tempLetter; }



        }
        //if we go past z, loop back to beginning.

    }


    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {
        List<String> cyrptText = new ArrayList<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String rot13Alphabet ="nopqrstuvwxyzabcdefghijklm";

        for (int i = 0; i < text.length(); i++){
            char indexChar = text.charAt(i);
            int alphabetindex = alphabet.indexOf(indexChar);
            String cryptedLetter = String.valueOf(rot13Alphabet.charAt(alphabetindex));
            cyrptText.add(cryptedLetter);
        }




        return cyrptText.toString();
    }

    public String encrypt(String text) {
        return text;
    }

    public String decrypt(String text) {
        return text;
    }

    public static String rotate(String s, Character c) {

        return "";
    }

}
