package com.src.Streams;
import java.util.stream.Stream;

public class UpperCaseex {

    public static void main(String args[]) {

        UpperCaseex st = new UpperCaseex();
        st.print();
    }

    public void print() {

        Stream.of("alex", "dad", "mon")
            .filter(s -> {
                System.out.println("Processing: " + s);
                return true;
            })
            .map(String::toUpperCase)
            .forEach(s -> System.out.println("Uppercase: " + s));
    }
}
