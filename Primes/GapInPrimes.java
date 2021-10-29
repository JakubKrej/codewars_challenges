package com.company.Primes;

import java.util.Arrays;

public class GapInPrimes {

    public  long[] gap(int g, long m, long n) {


        long[] numbers = new long[2];
        int last = -1;


        for (int i = (int) m; i < n; i++) {
            if (isPrime(i)) {
                if (i - last == g) {

                    numbers[0] = last;
                    numbers[1] = i;
                    return numbers;
                }

                last = i;

            }

        }


        return numbers;
    }


    boolean isPrime(int i){

        for(int j =2; j*j<= i; j++){
            if (i%j ==0){
                return false;
            }
        }
        return true;

    }
}