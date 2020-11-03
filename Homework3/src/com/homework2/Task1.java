package com.homework2;

import java.util.Arrays;
/*

    Маємо масив із деякими числами. Всі числа однаково окрім одного. Спробуйте знайти його.
    Гарантовано масив містить щонайменше 3 числа.
    Тест містить дуже величезні масиви, тож подумайте про продуктивність.
    findUnique(new double[]{1,1,1,2,1,1}); => 2
    findUnique(new double[]{0,0,0.55,0,0}); =>0.55
 */
public class Task1 {
    public double findUnique(double arr[]) {
        if(arr.length <= 2)
            return 0;

        double unique = 0;
        //Сортування масиву
        Arrays.sort(arr);
        //Теж сортування
        /*for (int i = 0; i < arr.length; i++) {
            double min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                double tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }*/
        if(arr[0] != arr[1])
            unique = arr[0];
        else if (arr[arr.length-1] != arr[1])
            unique = arr[arr.length-1];
        else {
            System.out.println("We don't have unique number!");
        }
        return unique;
    }
}
