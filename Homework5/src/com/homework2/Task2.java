package com.homework2;

import java.util.Scanner;

/*
    Метод реалізації. Метод повертає true, якщо у фразі немає жодної з літер у чорному списку.
    Якщо принаймні одна літера із чорного списку присутня у фразі return false.
    Порівняння має бути несуттєвим. Значення 'A' == 'a'
 */
public class Task2 {
    public void findSymbols() {
        Scanner in = new Scanner(System.in);
        String blackList, str;
        //Додання символів до чорного списку
        do {
            System.out.print("Enter a chars which we add to blacklist: ");
            blackList = in.nextLine();
            if(blackList.equals(""))
                System.out.println("Please insert a chars: ");
        }while(blackList.equals(""));
        //Введення речення
        do{
            System.out.print("Enter a sentence: ");
            str = in.nextLine();
            if(str.equals(""))
                System.out.println("Please insert a chars: ");
        }while(str.equals(""));

        String[] chars = blackList.split(",");
        boolean bool = false;
        //Перевірка
        for(int i =0;i<chars.length;i++) {
            if ((str.contains(chars[i].toLowerCase())) || (str.contains(chars[i].toUpperCase()))) {
                bool = false;
                break;
            }else {
                bool = true;
            }
        }
        System.out.println(bool);
    }
}
