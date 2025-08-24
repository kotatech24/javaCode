package com.src.functional;

import java.time.LocalTime;
import java.util.function.Supplier;
import java.lang.StringBuilder;

public class Supplierex {
    public static void main(String[] args) {

        Supplierex suppleex= new Supplierex();

        suppleex.supplier();

    }


    public void supplier(){


        Supplier<StringBuilder> supplier= () -> new StringBuilder();

        System.out.println(supplier.get().append("sb"));

        Supplier<LocalTime> localTimeSupplier= () -> LocalTime.now();

        System.out.println(localTimeSupplier.get());

        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println(randomSupplier.get());



    }
}
