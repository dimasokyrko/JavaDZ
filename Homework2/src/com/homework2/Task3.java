package com.homework2;
/*
    Даний рядок <<ajnvkjhmkmjxhfvhfb>> (просто набір букв в нижньому регістрі),
    потрібно підняти в верхній регістр всі букви в діапазоні від H до T по
    алфавіту.
 */
public class Task3 {
    public String upInRegistr(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) >= 'h' && str.charAt(i) <= 't') {
                char a = (char)(str.charAt(i) - 32);
                str = str.substring(0, i) + a + str.substring(i+1);
            }
        }
        return str;
    }
}
