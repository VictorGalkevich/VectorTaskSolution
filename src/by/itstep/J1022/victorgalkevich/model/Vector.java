package by.itstep.J1022.victorgalkevich.model;

import java.util.Arrays;

public class Vector {
    private static int counter = 0;
    private int[] array;

    public Vector() {
        this.array = new int[10];
    }

    public Vector(int[] array) {
        this.array = array;
    }

    public int length() {
        return array.length;
    }

    public int get(int index) {
        return array[index];
    }

}
