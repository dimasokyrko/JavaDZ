package com.homework2;

/*
    Ви маєте масив чисел
    Ваше завдання відсортувати зростаючі непарні числа, але парні числа повинні бути на своїх місцях.
    Нуль не є непарним числом, і вам не потрібно його переміщувати. Якщо у вас порожній масив, його потрібно повернути.
    Приклад:
    sortArray([5,3,2,8,1,4]) == [1,3,2,8,5,4]
 */
public class Task2 {
    public void sortArray(int arr[]) {
        int num;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]%2 != 0)
            {
                for(int j = i; j < arr.length; j++)
                {
                    if(arr[j]%2 != 0 && arr[i] > arr[j])
                    {
                        num = arr[i];
                        arr[i] = arr[j];
                        arr[j] = num;
                    }
                }
            }
        }
    }
}
