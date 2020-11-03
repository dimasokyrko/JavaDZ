package com.homework1;

import java.util.Scanner;

/*створити метод (private int[] fillArray(int begin, int end, int step)
який заповнює масив від begin до end з кроком step
 */
public class Task2 {

    private int begin, end, step;

    public int entering() {
        Scanner str = new Scanner(System.in);
        int num = str.nextInt();
        return num;
    }

    public void enteringData() {
        System.out.print("Begin = ");
        begin = entering();
        System.out.print("End = ");
        end = entering();
        System.out.print("Step = ");
        step = entering();
    }

    //Заповнити масив
    private int[] fillArray(int begin, int end, int step) {
        int size;
        if (begin >= end || step > (end - begin)) {
            System.out.println("You can't create this array!");
            return null;
        }
        size = (int) ((float) (end / step) - (float) (begin / step));
        if (begin % step == 0)
            size++;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = begin + step * i;
        return arr;
    }

    //Вивисти одновимірний масив
    public void printArray(int[] arr) {
        System.out.println("Your array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public void result() {
        int[] array = new int[1000];
        enteringData();
        array = fillArray(begin, end, step);
        printArray(array);
    }
}
