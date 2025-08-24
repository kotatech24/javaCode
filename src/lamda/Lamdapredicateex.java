package com.src.lamda;

import java.util.function.Predicate;
import java.lang.String;

public class Lamdapredicateex {


    public static void main(String[] args) {
        Lamdapredicateex lamda = new Lamdapredicateex();
        lamda.predicate();
    }


    public void predicate(){

        Predicate<String> pStr = s -> s.contains("City");
        System.out.println(pStr.test("Vatican City"));//true
        Predicate<String> pStr2 = s -> s.length() > 5;
        System.out.println(pStr2.test("Vatican City"));//true
        Predicate<String> pStr3 = s -> s.startsWith("Vatican");
        System.out.println(pStr3.test("Vatican City"));//true
        Predicate<String> pStr4 = s -> s.endsWith("City");
        System.out.println(pStr4.test("Vatican City"));//true
        Predicate<String> pStr5 = s -> s.isEmpty();
        System.out.println(pStr5.test("Vatican City"));//false
        Predicate<String> pStr6 = s -> s.length() == 12;
        System.out.println(pStr6.test("Vatican City"));//true
        Predicate<String> pStr7 = s -> s.length() < 15;
        System.out.println(pStr7.test("Vatican City"));//true
        Predicate<String> pStr8 = s -> s.equals("Vatican City");
        System.out.println(pStr8.test("Vatican City"));//true
        Predicate<String> pStr9 = s -> s.equalsIgnoreCase("vatican city");
        System.out.println(pStr9.test("Vatican City"));//true
        Predicate<String> pStr10 = s -> s.contains("Vatican") && s.contains("City");
        System.out.println(pStr10.test("Vatican City"));//true
        Predicate<String> pStr11 = s -> s.length() > 0 && s.contains("City");
        System.out.println(pStr11.test("Vatican City"));//true
        Predicate<String> pStr12 = s -> s.length() > 0 && s.contains("Vatican") && s.contains("City");
        System.out.println(pStr12.test("Vatican City"));//true
        Predicate<String> pStr13 = s -> s.length() > 0 && s.contains("Vatican") && s.contains("City") && s.startsWith("Vatican");
        System.out.println(pStr13.test("Vatican City"));//true
        Predicate<String> pStr14 = s -> s.length() > 0 && s.contains("Vatican") && s.contains("City") && s.startsWith("Vatican") && s.endsWith("City");
        System.out.println(pStr14.test("Vatican City"));//true
        Predicate<String> pStr15 = s -> s.length() > 0 && s.contains("Vatican") && s.contains("City") && s.startsWith("Vatican") && s.endsWith("City") && s.equals("Vatican City");
        System.out.println(pStr15.test("Vatican City"));//true
        Predicate<String> pStr16 = s -> s.length() > 0 && s.contains("Vatican") && s.contains("City") && s.startsWith("Vatican") && s.endsWith("City") && s.equalsIgnoreCase("vatican city");
        System.out.println(pStr16.test("Vatican City"));//true
        Predicate<String> pStr17 = s -> s.length() > 0 && s.contains("Vatican") && s.contains("City") && s.startsWith("Vatican") && s.endsWith("City") && s.equalsIgnoreCase("vatican city") && s.length() == 12;
        System.out.println(pStr17.test("Vatican City"));//true
        Predicate<String> pStr18 = s -> s.length() > 0 && s.contains("Vatican") && s.contains("City") && s.startsWith("Vatican") && s.endsWith("City") && s.equalsIgnoreCase("vatican city") && s.length() == 12 && s.length() < 15;
        System.out.println(pStr18.test("Vatican City"));//true


    }
}
