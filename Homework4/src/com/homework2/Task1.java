package com.homework2;

import java.util.Scanner;

/*
    З консолі вводиться довільний рядок який містить математичні операції (<<1+5+8-7*5/4>>)
    потрібно вивести на екран результат обчислення даного рядка(Пріорітет виконання
    операцій не враховувати).
 */
public class Task1 {
    public void mathOperation() {
        Scanner in = new Scanner(System.in);
        String str;
        str = in.next();
        if(str.matches("(?i).*[a-zA-Z].*")) {
            System.out.print("String must not contain letters!");
            return;
        }

        str += "\n";

        double res = 0;
        double t = 0;
        int saveI = 0;

        for(int i = 0; i < str.length(); i++) {
            if((int)str.charAt(i)-48 >= 0 && (int)str.charAt(i)-48 <= 9) {
                t = t * 10 + ((int)str.charAt(i)-48);
            }
            else {
                if(res != 0 && t != 0){
                    switch (str.charAt(saveI)) {
                        case '+': {
                            res += t;
                            t = 0;
                            saveI = i;
                            break;
                        }
                        case '-': {
                            res -= t;
                            t = 0;
                            saveI = i;
                            break;
                        }
                        case '*': {
                            res *= t;
                            t = 0;
                            saveI = i;
                            break;
                        }
                        case '/': {
                            res /= t;
                            t = 0;
                            saveI = i;
                            break;
                        }
                    }
                }
                else {
                    res = t;
                    t = 0;
                    saveI = i;
                }
            }
        }

        System.out.print(res);
    }
}
