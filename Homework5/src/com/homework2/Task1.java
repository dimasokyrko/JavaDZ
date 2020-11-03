package com.homework2;

//Дано речення. Знайдіть у цьому реченні найдовше слово та поверніть його довжину

import java.util.Scanner;

public class Task1 {
    public void longestWord() {

        Scanner in = new Scanner(System.in);

        int largestLength = 0;
        String longestWord = "";
        String str;
        //Ввід строки
        do{
            System.out.print("Enter a String: ");
            str = in.nextLine();
            if(str.equals(""))
                System.out.println("Please write a String!");
        }while(str.equals(""));
        //Знаходження найбільшого слова
        for (String b : str.split(" ")) {
            if (longestWord.length() == 0) {
                largestLength = b.length();
                longestWord = b;
            } else if (b.length() >= largestLength) {
                largestLength = b.length();
                longestWord = b;
            }
        }
        System.out.println("Longest Word: " + longestWord);
        System.out.println("Longest Word: " + largestLength);
    }
}
