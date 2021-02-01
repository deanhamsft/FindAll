package com.mycompany.fifth;

import java.util.ArrayList;

/**
 * returns english words found in a given string
 *
 */
public class Dictionary 
{
    public Boolean isEnglishWord(String word)
    {
        ArrayList<String> checkWords = new ArrayList<String>();
        checkWords.add("test");
        checkWords.add("testing");
        checkWords.add("sting");
        checkWords.add("giest");
        checkWords.add("seigt");
        checkWords.add("getstin");
        checkWords.add("king");
        checkWords.add("know");
        checkWords.add("wing");
        checkWords.add("now");

        if (checkWords.contains(word)){
        return true;
        }
        else{
            return false;
        }
    }
}
