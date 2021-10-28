//Take the following IPv4 address: 128.32.10.1
//
// This address has 4 octets where each octet is a single byte (or 8 bits).
//
//        1st octet 128 has the binary representation: 10000000
//        2nd octet 32 has the binary representation: 00100000
//        3rd octet 10 has the binary representation: 00001010
//        4th octet 1 has the binary representation: 00000001
//        So 128.32.10.1 == 10000000.00100000.00001010.00000001
//
// Because the above IP address has 32 bits, we can represent it as the unsigned 32 bit number: 2149583361
// Complete the function that takes an unsigned 32 bit number and returns a string representation of its IPv4 address.

package com.company.int32toIPv4;

import java.util.LinkedList;

public class Kata {

    public static String longToIP(long ip) {
        // Java doesn't have uint32, so here we use long to represent int32

        String finn = hexToIpv4(toHex(ip));
        System.out.println(finn);

        return finn; // do it!
    }


    public static LinkedList toHex(long x){

        LinkedList<Character> list= new LinkedList<>();

        for(;;){

            long doub;

            System.out.println(x);
            doub = x%2;
            x = x/2;


            if(doub==0){
                list.addFirst('0');
            }else{
                list.addFirst('1');
            }

            if(x==0) {
                break;
            }
        }
        int hex = 0;


        System.out.println(list);

        return list;
    }

    public static String hexaToDec(LinkedList<Character> list){


        int fin = 0;

        if(list.size()>=8)
            for(int i =0; i<8; i++){

                //System.out.println(list);
                char b =  (char)list.getLast();

                int num = Character.getNumericValue(b);

                int res = (int) (num * (Math.pow(2,i)));
                System.out.println(num);

                list.removeLast();

                fin = fin+res;

            }else if(list.size()<8)
        {
            System.out.println(list.size());

            int lists = list.size();
            for(int i =0; i<lists; i++){

                //System.out.println(list);
                char b =  (char)list.getLast();

                int num = Character.getNumericValue(b);

                System.out.println(num);

                int res = (int) (num * (Math.pow(2,i)));


                list.removeLast();

                fin = fin+res;

            }

        }


        System.out.println("............." + fin);

        return String.valueOf(fin);
    }

    public static String hexToIpv4(LinkedList list){

        if(list.size()==1){
            return "0.0.0.0";
        }else {

            String ipv4 = "";

            for (int j = 0; j < 4; j++) {
                if (j < 3) {
                    ipv4 = "." + hexaToDec(list) + ipv4;
                }
                if (j == 3) {
                    ipv4 = hexaToDec(list) + ipv4 ;
                }

            }

            return ipv4;
        }
    }
}
