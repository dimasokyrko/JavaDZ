package com.homework1;

import java.util.Scanner;

/*створити двовимірний масив, заповнити його рандомними значеннями від 0 до 9,
вивести його на єкран окремим методом(private void printArray(int[][] arr),
вивести на єкран всі парні числа побічної діагоналі
 */
public class Task1 {
    //ввод числа розміру масиву
    public int arrsize(){
        Scanner str = new Scanner(System.in);
        int num;
        do {
            num = str.nextInt();
            if(num<1)
                System.out.println("Write correct size of array!");
        }while(num<1);
        return num;
    }
    //Рандомно заповнити масив
    public void fillarray  (int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 9);
            }
        }
    }
    //Вивести двовимірний масив масив
    public void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    //Парні числа побічної діагоналі
    public void secondDiagonal(int[][] arr, int columns){
        System.out.println("Second diagonals numbers:");
        for (int i = 0; i < arr.length; i++) {
            if((arr[i][columns - i - 1] % 2) == 0){
                System.out.print(arr[i][columns - i - 1] + " ");
            }
        }
    }
    public void result(){
        int row, column;
        System.out.println("Please write size of array: ");
        row = arrsize();
        column = arrsize();
        int[][] a = new int[row][column];
        fillarray(a);
        System.out.println("Your array:");
        printArray(a);
        secondDiagonal(a, column);
    }
}