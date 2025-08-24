package com.src.methode;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.List;


public class Methode1
{
    public static void main(String[] args)
    {
        Methode1 methode1=new Methode1();
        methode1.boundMethode();
        methode1.unboundMethode();
        methode1.constructorMethode();



    }

    public void boundMethode()
    {
        String name="I am the king of the world";
        System.out.println(name);

        Supplier<String> lowerL=()->name.toLowerCase();
        Supplier<String> lowerMR=name::toLowerCase;



        System.out.println(lowerL.get());
        System.out.println(lowerMR.get());


        Supplier<String> upperLL=()->name.toUpperCase();
        Supplier<String> upperMR=name::toUpperCase;

        System.out.println(upperLL.get());
        System.out.println(upperMR.get());


        // Using method reference to call a static method

        Predicate<String> titlePredicate=s1-> s1.startsWith("Mr.");
        Predicate<String> titlePredicateMR=name::startsWith;

        System.out.println(titlePredicate.test("Mr. Smith"));
        System.out.println(titlePredicateMR.test("Mr. Smith"));




    }


    public void unboundMethode()
    {
      Function<String, String> toLowerCase = s->s.toLowerCase();
        Function<String, String> toLowerCaseMR = String::toLowerCase;

        System.out.println(toLowerCase.apply("HELLO WORLD"));
        System.out.println(toLowerCaseMR.apply("HELLO WORLD"));

        BiFunction <String, String, String> concat = (s1, s2) -> s1 + s2;
        BiFunction <String, String, String> concatMR = String::concat;

        System.out.println(concat.apply("Hello ", "World"));
        System.out.println(concatMR.apply("Hello ", "World"));


    }

    public void constructorMethode()
    {
      Supplier<StringBuilder> stringBuilderSupplier = () -> new StringBuilder();
        Supplier<StringBuilder> stringBuilderSupplierMR = StringBuilder::new;

        System.out.println(stringBuilderSupplier.get().append("kota"));
        System.out.println(stringBuilderSupplierMR.get().append("kota"));
        // Using method reference

        Function<Integer,List<String>> listSupplier = x-> new ArrayList<>(x);
        Function<Integer,List<String>> listSupplierMR = ArrayList::new;
          List<String> ls1=listSupplier.apply(10);
            ls1.add("20");

        List<String> ls2=listSupplierMR.apply(10);
            ls2.add("40");
        System.out.println(ls1);
        System.out.println(ls2);


    }
}
