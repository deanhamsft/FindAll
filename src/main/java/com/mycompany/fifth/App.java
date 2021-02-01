package com.mycompany.fifth;

import java.util.HashSet;
import java.util.Set;

public class App 
{
    static Dictionary dictionary = new Dictionary();
    static Set<String> returnList = new HashSet<String>();

    public static void main(String word) {

        Set<String> masterPerm = new HashSet<String>();
        // Creating array of string length 
        char[] c = new char[word.length()]; 

        // Copy character by character into array 
        for (int i = 0; i < word.length(); i++) { 
            c[i] = word.charAt(i); 
        }
        int t = (int) Math.pow(2, c.length);
        for(int i=1;i<t;i++) {
            String s = Integer.toBinaryString(i);
            String comb = selectLetters(s,c);
            
            Set<String> masterWords = findPerms(comb);
            for (String strNew : masterWords) {
                masterPerm.add(strNew);
            }
        }

        for(String strGood : masterPerm){
            if(dictionary.isEnglishWord(strGood)){
                returnList.add(strGood);
            }
        } 
        System.out.println("\nPermutations for " + word + " are: \n" + returnList);
    }

    private static String selectLetters(String s, char[] c) {
        String comb = "";
        int len = s.length();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '1') {
                comb += c[len-i-1];
            }
        }
        return comb;
    }

    public static Set<String> findPerms(String str) {
        Set<String> perm = new HashSet<String>();
        //Handling error scenarios
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0); // first character
        String rem = str.substring(1); // Full string without first character
        Set<String> words = findPerms(rem);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
                perm.add(charInsert(strNew, initial, i));
            }
        }
        return perm;
    }

    public static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }
}
