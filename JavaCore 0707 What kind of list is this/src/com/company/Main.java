package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*

Завдання:
Что за список такой?
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.

Требования:
1. Программа не должна ничего считывать с клавиатуры.
2. Объяви переменную типа ArrayList (список строк) и сразу проинициализируй ee.
3. Программа должна добавить 5 любых строк в список с помощью метода add().
4. Программа должна вывести размер списка на экран.
5. Программа должна вывести содержимое списка на экран, каждое значение с новой строки.

*/

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(String.valueOf(i));
        }

        System.out.println(strings.size());

        for (String string : strings) {
            System.out.println(string);
        }
    }
}









