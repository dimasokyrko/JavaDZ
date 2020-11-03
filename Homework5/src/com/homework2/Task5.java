package com.homework2;

import java.util.Scanner;

/*
    Напишіть функцію, яка приймає ціле невід’ємне число (секунди),
    як вхідні дані та повертає час у зручному для читання форматі
 */
public class Task5 {
    public void convertToNormalTime() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int seconds = in.nextInt();
        int sec = seconds % 60;
        int hour = seconds / 60;
        int min = hour % 60;
        hour = hour / 60;
        System.out.print(hour + ":" + min + ":" + sec);
        System.out.print("\n");
    }
}
