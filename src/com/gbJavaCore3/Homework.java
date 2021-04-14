package com.gbJavaCore3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Homework
 * @author - Nezhdanov Sergei
 * @version 1.0
 */
public class Homework {

    public static void main(String[] args) {
        String[] str = {"Мама", "мыла" , "раму"};

        System.out.println("The exercise 1: ");
        System.out.println(Arrays.toString(str));
        exchangeItems(str, 0, 2);
        System.out.println(Arrays.toString(str));
        exchangeItems(str, 0, 2);
        System.out.println();
        System.out.println("The exercise 2: ");
        System.out.println(toArrayList(str));
        System.out.println();
        System.out.println("The exercise 3: ");
        //creating a box with apples
        Box<Apple> boxApple = new Box<>();
        //put apples in the box
        for (int i = 0; i < 150; i++) {
            boxApple.addFruit(new Apple());
        }
        //creating a box with oranges
        Box<Orange> boxOrange = new Box<>();
        //put oranges in the box
        for (int i = 0; i < 100; i++) {
            boxOrange.addFruit(new Orange());
        }
        //comparing weight of the boxes
        System.out.println(boxApple.compareTo(boxOrange));

        //creating another box with apples
        Box<Apple> anotherBoxApple = new Box<>();
        //quantity of fruit in the box before
        System.out.println(anotherBoxApple.getList().size());
        Box.overPour(anotherBoxApple, boxApple);
        //quantity of fruit in the box after
        System.out.println(anotherBoxApple.getList().size());

    }

    /**
     * 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа)
     */
    public static <T> void exchangeItems(T[] array, int i, int j) {
        T box = array[i];
        array[i] = array[j];
        array[j] = box;
    }

    /**
     * 2. Написать метод, который преобразует массив в ArrayList
     */
    public static <T> List<T> toArrayList(T[] array) {
        List<T> list = new ArrayList<>();

        for (T t : array) {
            list.add(t);
        }

        return list;
    }
}
