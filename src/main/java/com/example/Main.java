package com.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        int a =1000;
        int b=2000;
         Cestini c = new Cestini(0);
         Persone p1 = new Persone(c, 10000);
         Persone p2 = new Persone(c,10000);

         p1.start();
         p2.start();

         p1.join();
         p2.join();
         System.out.println(c.getContatore());



    }
}