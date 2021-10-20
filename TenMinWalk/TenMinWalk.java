package com.company;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int s = 0;
        int n = 0;
        int e = 0;
        int w = 0;

        for(int i = 0; i< walk.length;i++) {
            if ( walk[i]=='s')
                s++;
            if ( walk[i]=='n')
                n++;
            if ( walk[i]=='e')
                e++;
            if ( walk[i]=='w')
                w++;

        }

        if ( (s+n+e+w==10) && s==n && e==w )
            return true;
        else return false;
    }
}
