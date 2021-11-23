// n this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
//
//Examples
//highAndLow("1 2 3 4 5")  // return "5 1"
//highAndLow("1 2 -3 4 5") // return "5 -3"
//highAndLow("1 9 3 4 -5") // return "9 -5"




package com.company.highAndLow;

import com.sun.jdi.IntegerValue;

public class highAndLow {

    public static String highAndLow(String numbers) {

        String[] actualValue = numbers.split(" ");

        int max_val = 0;
        int min_val = 0;

        if (actualValue.length > 1) {
             max_val= Integer.parseInt(actualValue[0]);
             min_val = Integer.parseInt(actualValue[1]);
        }else
        if(actualValue.length ==1){
             max_val= Integer.parseInt(actualValue[0]);
             min_val = Integer.parseInt(actualValue[0]);
        }

        for(int i=0;i< actualValue.length;i++){

            if( Integer.parseInt(actualValue[i]) < min_val){
                min_val = Integer.parseInt(actualValue[i]);
            }
            if( Integer.parseInt(actualValue[i]) > max_val){
                max_val = Integer.parseInt(actualValue[i]);
            }

        }

        String result = max_val + " " + min_val;

        return result;
    }
}
