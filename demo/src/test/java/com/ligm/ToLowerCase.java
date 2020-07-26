package com.ligm;

import org.junit.jupiter.api.Test;

public class ToLowerCase{
    @Test
    public void testLowerCase(){
        char s='a';
        char b=(char)(s^32);
        System.out.println("b = " + b);
        String str="hello";
        char c = str.charAt(0);
      //  System.out.println((int)c);
        //System.out.println((char)(c-32));
        String daxie = (char) (str.charAt(0) - 32)+str.substring(1,str.length());
        //System.out.println("daxie = " + daxie);
        System.out.print(Math.round(-1.6)+",");//floor(-1.6+0.5)
        System.out.print(Math.round(-1.5)+",");
        System.out.print(Math.round(-1.4)+",");
        System.out.print(Math.round(1.2)+",");
        System.out.print(Math.round(1.5)+",");
        System.out.println(Math.round(1.7)+".");
        System.out.print(Math.ceil(8.7)+",");    //大于或等于
        System.out.print(Math.ceil(8.5)+",");
        System.out.print(Math.ceil(8.3)+",");
        System.out.print(Math.ceil(-1.7)+",");
        System.out.print(Math.ceil(-1.5)+",");
        System.out.println(Math.ceil(-1.3)+".");
        System.out.print(Math.floor(8.7)+  " ,");    //小于
        System.out.print(Math.floor(8.5)+  " ,");
        System.out.print(Math.floor(8.3)+  " ,");
        System.out.print(Math.floor(-1.7)+  ", ");
        System.out.print(Math.floor(-1.5)+  ", ");
        System.out.print(Math.floor(-1.3)+  " ,");


    }

}
