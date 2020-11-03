package com.homework2;

import java.util.Scanner;

/*
    Маємо масив рядків, розвернути його таким чином, щоб його довжина
    залишилася такою ж, як довжина оригінальних входів
 */
public class Task3 {
    public void reverses() {
        Scanner in = new Scanner(System.in);
        String str;
        System.out.print("Write your String: ");
        str = in.nextLine();
        char[] arr = str.toCharArray();
        char[] result = new char[arr.length];

        //Заповнюємо пробіли
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                result[i] = ' ';
            }
        }

        //Розвертаємо строку
        int j = result.length - 1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != ' ') {

                if (result[j] == ' ') {
                    j--;
                }
                result[j] = arr[i];
                j--;
            }
        }
        System.out.println(String.valueOf(result));
    }
}
