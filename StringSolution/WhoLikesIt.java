package com.company.StringSolution;

public class WhoLikesIt {

    public static String Solution(String... names){

        String result = "";

        if( names.length==0){
            result = "no one likes this";
        }else if( names.length==1){
            result = String.format("%s%s",names[0], " likes this");
        }else if( names.length==2){
            result = String.format("%s%s%s%s", names[0], " and ", names[1], " like this");
        }else if( names.length==3){
            result = String.format("%s%s%s%s%s%s", names[0], ", ", names[1], " and ", names[2] ," like this");
        }else if( names.length>3){

            int num = names.length - 2;


            result = String.format("%s%s%s%s%s%s", names[0], ", ", names[1], " and ", num  ," others like this");
        }


        return result ;
    }


}
