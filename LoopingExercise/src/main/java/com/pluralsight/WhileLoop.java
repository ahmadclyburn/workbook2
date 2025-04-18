package com.pluralsight;

public class WhileLoop {
    public static void main(String[] args) throws InterruptedException {
        int saying =1 ;

        while (saying <= 5) {
            System.out.println("I Love Java");
            saying = saying +1;

        }
        for (int i = 10; i >= 1; i = i - 1){
        System.out.println(i);

        Thread.sleep(1000);
        }
        System.out.println("I Love Java");
    }

}

