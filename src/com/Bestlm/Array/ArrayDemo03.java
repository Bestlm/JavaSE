package com.bestlm.array;

/**
 * @author Bestlm
 * @date 2021/4/21
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        //二维
        int[][] arrays = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        printArray(arrays);
    }

    public static void printArray(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.println(arrays[i][j]);
            }
        }
    }
}
