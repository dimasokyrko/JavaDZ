package com.homework2;

import java.util.Scanner;
/*
    Написати метод який буде читати з консолі довільний рядок в форматі (<<+Andrew>> або <<-John>>)
    в залежності від оператора (+ або -) додає в рядок (саме в рядок, НЕ В КОЛЕКЦІЮ) або ж віднімає від нього дане
    слово(якщо такого немає, вивести відповідне повідомлення у консоль). Зробити все в циклі while в якому має бути
    switch який буде пропонувати варіанти того, шо можна зробити: 1-ввести нове значення, 2-вивести на екран всі
    введенні значення, 3-вихід з програми.
 */
public class Task3 {
    public void writeSentence() {
        Scanner in = new Scanner(System.in);
        String str = "";
        String enterStr;
        int num;

        while (true) {
            System.out.print("1. Enter a new value(with a + or - on the beginning)\n2. Show all entered values\n3. Exit\n");
            do {
                num = in.nextInt();
            }while(num > 3 && num < 1);
            switch (num) {
                case 1: {
                    //Додавання слова у рядок
                    System.out.print("Enter a new value:\n");
                    enterStr = in.next();
                    if (enterStr.charAt(0) == '+') {
                        if (str == "")
                            str += enterStr.substring(1);
                        else
                            str += ", " + enterStr.substring(1);
                    }
                    //Видалення слова з рядку
                    else if (enterStr.charAt(0) == '-') {
                        if (str.indexOf(enterStr.substring(1)) == 0)
                            str = str.substring(enterStr.length() + 1);
                        else {
                            if(str.contains(enterStr.substring(1))) {
                                str = str.substring(0, str.indexOf(enterStr.substring(1)) - 2) + str.substring(str.indexOf(enterStr.substring(1)) - 1 + enterStr.length());
                            }
                            else{
                                System.out.println("We don't have this word in sentence!");
                            }
                        }
                    } else {
                        System.out.print("Please write correctly!\n");
                    }
                    break;
                }
                case 2: {
                    System.out.print(str + "\n");
                    break;
                }
                case 3: {
                    return;
                }
            }
        }
    }
}
