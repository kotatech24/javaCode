package com.src.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Functionex {

    public static void main(String[] args) {
        Functionex fex = new Functionex();

        fex.functions();
    }

    public void functions(){

        Function<String,Integer> function= s->s.length();
        System.out.println(function.apply("Hello, World!"));

        Function<String, String> toUpperCase = String::toUpperCase;

        System.out.println(toUpperCase.apply("hello world"));

        Function<String, String> toLowerCase = String::toLowerCase;
        System.out.println(toLowerCase.apply("HELLO WORLD"));

        BiFunction<String,String,Integer> func=(s1, s2)->s1.length() + s2.length();

        System.out.println(func.apply("Hello", "World"));

        BiFunction<String, String, String> concatFunction = (s1, s2) -> s1.concat(s2);

        System.out.println(concatFunction.apply("hellow","world"));



    }
}
