package com.company;

import java.util.*;


public class Pangram {

    public boolean check(String sentence) {

        String[] alfabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u"
                , "v", "w", "x", "y", "z"};

        int v = 0;


        sentence = sentence.toLowerCase();
        Set charlist = new HashSet();
        List charlist1 = new ArrayList();
        for (char c : sentence.toCharArray()){

            if (Character.isLetter(c))
                charlist.add(c);

        }

        for( Object c : charlist.toArray())
            charlist1.add(c);


        if (charlist.size() >= 26) {

            for (int i = 0; i < charlist.size(); i++) {

                if (!charlist1.get(i).equals(alfabet[i])) {

                    v++;
                }
            }


        }

        if(v == 26){
            return true;
        }else{
            return false;
        }

    }
}
