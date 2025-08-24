package com.src.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream.*;




public class Stream1 {
    public static void main(String args[]) {
        Stream1 st = new Stream1();
        st.print();

    }


    public void print() {
        System.out.println("Hello World");


        List<Integer> list = Arrays.asList(100, 200, 20, 40, 4);

        System.out.println(list.stream().peek(System.out::println)
                .filter(te -> te < 100)
                .peek(System.out::println)
                .count());

    }
}