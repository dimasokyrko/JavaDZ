package com.homework2;
//Третя лабораторна
import java.util.Arrays;
import java.util.List;
import java.lang.Math;

public class Main {
    
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "c3", "a2", "b1", "c2", "c1");
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();

        task1.SortC(myList);
        System.out.println(myList);

        task2.arithmeticMean(10);

        String str = "abcdefghijklmnop";
        str = task3.upInRegistr(str);
        System.out.println(str);
    }
}
