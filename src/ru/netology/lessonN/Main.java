package ru.netology.lessonN;

public class Main {

    public static void main(String[] args) {
        BinOps bins = new BinOps();
        //демонстрация
        System.out.println(bins.sum("00000101", "00000010"));
        System.out.println(bins.mult("00000101", "00000010"));
    }
}

