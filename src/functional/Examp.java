package com.src.functional;


import java.util.stream.Stream;

public class Examp {

    public static void main(String args[])
    {

        Stream<Integer> streamI=Stream.of(1,2,3,4);

        Stream<String> streamS=Stream.of("a","b");

        System.out.println(streamI.count());

        System.out.println(streamS.count());

    }

}
