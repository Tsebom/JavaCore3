package com.gbJavaCore3;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> implements ComparableBox<Box> {
    private List<T> list;

    public Box() {
        this.list = new ArrayList<T>();
    }

    public List<T> getList() {
        return list;
    }

    /**
     * This method adds fruit to the box
     * @param t - Added fruit
     */
    public void addFruit(T t) {
        list.add(t);
    }

    /**
     * This method gives weight of fruit in the box
     * @return - the weight of fruits in the box
     */
    public float getWeight() {
        if (list.size() != 0) {
            return list.size() * list.get(0).getWeightOneFruit();
        }
        return 0;
    }

    /**
     * Pour over fruit from one box to another
     * @param dest - the box where fruit are gone to
     * @param src - the box where fruit are gone from
     * @param <T> - the type of fruit
     */
    public static  <T> void overPour(Box<? super T> dest, Box<? extends T> src) {
        for (T t : src.getList()) {
            dest.addFruit(t);
        }
    }

    /**
     * comparing weight of the boxes with fruits
     * @param o - another box
     * @return - true, if they is equal and false if they not
     */
    @Override
    public boolean compareTo(Box o) {
        return this.getWeight() == o.getWeight();
    }
}
