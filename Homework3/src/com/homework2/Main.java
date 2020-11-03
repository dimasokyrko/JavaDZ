package com.homework2;
//Четверта лабораторна
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        System.out.println("Unique number: " + task1.findUnique(new double[]{1, 1, 1, 2, 1, 1, 1}));
        //System.out.println("Unique number: " + task1.findUnique(new double[]{0.55 ,1 ,1 ,1 ,2 ,1 ,1 ,1}));
        int arr[] = new int[]{5, 3, 2, 8, 1, 4};
        //int arr[] = new int[]{5, 9, 4, 0, 1, 0, 6, 3, 7, 5, 4, 2};
        task2.sortArray(arr);
        for(int i=0; i<arr.length;i++)
            System.out.print(arr[i] + "  ");
    }
}
