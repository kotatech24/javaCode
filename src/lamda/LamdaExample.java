package com.src.lamda;

import java.util.function.Predicate;

public class LamdaExample {

    public static void main(String[] args) {
        LamdaExample lamda = new LamdaExample();
        lamda.predicate();
    }

    public void  predicate()
    {

        Predicate<String> pStr=s->s.contains("kota");

        System.out.println(pStr.test("srinivas kota")); // true

        Predicate<String> pStr2=s->s.length()>5;

        System.out.println(pStr2.test("srinivas"));
        System.out.println(pStr2.test("srin"));

    }


}
