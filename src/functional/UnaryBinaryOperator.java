package com.src.functional;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperator {

    public static void main(String[] args) {

        UnaryBinaryOperator ubo = new UnaryBinaryOperator();

        ubo.UniBinaryOperator();

    }

    public  void UniBinaryOperator()
    {
        UnaryOperator<String> unaryOperator = name ->"My Name"+name;

        unaryOperator.apply("Kota");

        BinaryOperator<String> binaryOperator=(s1,s2) -> s1.concat(s2);

        System.out.println(binaryOperator.apply("Hello", "World"));




    }
}
