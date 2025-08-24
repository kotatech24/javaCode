package com.src.lamda;

interface IA{

    void m1();
}


public class Blamda {

    public static void main(String args[])
    {

        IA i=()->System.out.println("Hello world");

        i.m1();

       IA lamda1=()->{

           System.out.println("Hello world");
       };

        lamda1.m1();



    }
}
