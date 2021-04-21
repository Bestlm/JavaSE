package com.bestlm.array;

/**
 * @author v_hrhrhu
 * @date 2021/4/21
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //输出数组值
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
        System.out.println("===============");

        //下标越界
        /*
         * for (int i = 0; i <= arrays.length; i++) {
         System.out.print(arrays[i]+" ");
         }
         */

        System.out.println("================");
        //数组求和
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
        }
        System.out.println("和为：" + sum);

        System.out.println("=================");
        //提取最大值
        int max = 0;
        for (int i = 1; i < arrays.length; i++) {
            max = arrays[i];
        }
        System.out.println("最大值:" + max);
    }
}
