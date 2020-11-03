package com.homework2;
/*
    Написати метод, який заповнить масив довільного розміру числами по зростанню
    починаючи з центру масиву ([3, 2, 1, 0, 1, 2, 3]).
 */
public class Task2 {
    public void mass(int n) {
        int arr[] = new int[n];
        int m = Math.round(n/2);
        int k = 0, t = 0;

        if(n%2 == 0)
            k = 1;
        else
            t = 1;

        for(int i = 0; i < m + t; i++) {
            arr[m - i - k] = i;
            arr[m + i] = i;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\n");
        return;
    }
}
