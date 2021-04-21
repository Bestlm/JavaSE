package com.bestlm.array;

/**
 * @author v_hrhrhu
 * @date 2021/4/21
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        //for each
        int[] arrays = {1, 2, 3, 4, 5, 6};
        for (int array : arrays) {
            System.out.println(array + " ");
        }
        System.out.println("===========");
        printArray(arrays);

        int[] reverse = reverse(arrays);
        printArray(reverse);
    }

    //反转数组
    public static int[] reverse(int[] arrays){
        int[] result = new int[arrays.length];
        for (int i = 0,j= arrays.length-1 ;i < arrays.length; i++,j--) {
            result[j] = arrays[i];
        }
        return result;
    }
    //打印方法
    public static void printArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
    }
}
