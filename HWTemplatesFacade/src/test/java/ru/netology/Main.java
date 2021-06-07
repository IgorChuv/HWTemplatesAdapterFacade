package ru.netology;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("101110","111100"));
        System.out.println(bins.mult("10111","10001"));
    }
}