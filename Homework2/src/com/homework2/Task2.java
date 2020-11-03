package com.homework2;

import java.util.Random;
/*
    Заповнити масив розміром n рандомними значеннями в діапазоні (від 0 до 9)
    та порахувати середнє арифметичне всіх парних чисел.
 */
public class Task2 {
    public void arithmeticMean(int n) {
        int[] arr = new int[n];
        Random rand = new Random();
        int counter = 0;

        float sum= 0;

        for(int i = 0; i < n; i++)
        {
            arr[i] = (int) (Math.random() * 9);
            if(arr[i] % 2 == 0) {
                sum += arr[i];
                counter++;
            }
            System.out.print(arr[i] + " ");
        }
        if(sum == 0)
            System.out.println("We don't have any pair numbers in array!");
        else {
            sum /= counter;
            System.out.println("\n" + sum);
        }
    }
}
