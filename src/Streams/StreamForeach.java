package com.src.Streams;
import java.util.stream.Stream;
import java.util.stream.*;



public class StreamForeach {
    public static void main(String args[]) {

        StreamForeach st = new StreamForeach();
        st.print();
    }


    public void print() {

        Stream.Of("alex", "dad", "mon")
                .filter(s -> System.out.println("ahi" +s);
                        return s.toUpperCase();)
                  .anyMatch(s -> System.out.println("Checking: " + s);
                  return s.startsWith("A"))
    }
}