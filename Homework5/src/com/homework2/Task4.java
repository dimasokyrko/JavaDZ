package com.homework2;
/*
    Реалізувати метод findMultiples (x, n),
    який повертає масив перших x кратних дійсних чисел n
 */
public class Task4 {
    public void findMultiplies(int x, int n) {
        int num;
        for (int i = 1; i <= x; i++) {
            num = n * i;
            System.out.println(num);
        }
    }
}
