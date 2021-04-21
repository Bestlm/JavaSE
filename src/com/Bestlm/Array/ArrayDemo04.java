package com.bestlm.array;

import java.util.Arrays;

/**
 * @author v_hrhrhu
 * @date 2021/4/21
 */
public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] array = {1, 256, 451, 7, 498, 323, 636};
        //Array方法调用
        //打印
        System.out.println(Arrays.toString(array));
        //排序
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        //填充
        Arrays.fill(array, 12);
        System.out.println(Arrays.toString(array));
    }
}
