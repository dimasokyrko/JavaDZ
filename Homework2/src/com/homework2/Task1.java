package com.homework2;

import java.util.List;

/*
    List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        Вивести в консоль всі змінні в відсортованому вигляді які починаються з <<c>>
    та трансформувати їв в верхній регістр.
 */
public class Task1 {
    //Сортування масиву по числу після "с"
    public void SortC(List<String> list)
    {
        String found;
        int saveI;
        for(int i = 0; i < list.size(); i++)
        {
            //Пошук строки з початком "с"
            if(list.get(i).charAt(0) == 'c')
            {
                found = list.get(i);
                saveI=i;
                for(int j = i+1; j < list.size(); j++)
                {
                    if(list.get(j).charAt(0) == 'c')
                    {
                        //Порівняння
                        if(Integer.parseInt(list.get(j).substring(1)) < Integer.parseInt(found.substring(1))) {
                            found = list.get(j);
                            saveI = j;
                        }
                    }
                }
                //Сортування
                list.set(saveI, list.get(i));
                list.set(i, found);
            }
        }
    //Переведення "с" у верхній регістр
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).charAt(0) == 'c')
                list.set(i, list.get(i).replace('c', 'C'));
        }
    }
}
