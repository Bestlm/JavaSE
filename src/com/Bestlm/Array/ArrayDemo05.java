package com.bestlm.array;

import java.util.Arrays;

/**
 * @author v_hrhrhu
 * @date 2021/4/21 15:12
 */
public class ArrayDemo05 {
    public static void main(String[] args) {
        //冒泡
        int[] a = {1, 256, 451, 7, 498, 323, 636};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    int temp = 0;

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
