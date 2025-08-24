package com.src.functional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.List;
import java.util.Map;


public class Consumerex {

    public static void main(String[] args) {
        Consumerex conex = new Consumerex();

        conex.Consumer();
    }

    public void Consumer() {

        Consumer<String> consumer = s -> System.out.println(s);

        consumer.accept("Hello, World!");

        List<String> names = new ArrayList<>();
        names.add("Names");
        names.add("Value");
        consumer.accept("End of the world!");

        names.forEach(consumer);

        Map mapCap = new HashMap<String, String>();

        BiConsumer biCon = (k, v) -> mapCap.put(k, v);

        biCon.accept("India", "Delhi");
        biCon.accept("USA", "Washington DC");

        System.out.println(mapCap);



        BiConsumer<String, String> biConsumer = (key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        };
        biConsumer.accept("Country", "India");

        System.out.println("after");

        mapCap.forEach(biConsumer);


    }
}















