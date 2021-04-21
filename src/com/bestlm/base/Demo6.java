package com.bestlm.base;

import java.util.Scanner;

/**
 * @author Bestlm
 * @description switch+while循环计算器
 * @date : 2021/4/20
 */
public class Demo6 {
    /**
     * while + switch循环计算器
     */
    public static void main(String[] args) {
        /**创建对象调用对象里面的方法*/
        Demo6 demo6 = new Demo6();
        /**方法的调用*/
        demo6.jisuan();
    }

    /**
     * 加法
     */
    public static double sum(double a) {
        System.out.println("请输入一个数");
        Scanner scan3 = new Scanner(System.in);
        double b = scan3.nextDouble();
        return a + b;
    }

    /**
     * 减法
     */
    public static double sub(double a) {
        System.out.println("请输入一个数");
        Scanner scan4 = new Scanner(System.in);
        double b = scan4.nextDouble();
        return a - b;
    }

    /**
     * 乘法
     */
    public static double mul(double a) {
        System.out.println("请输入一个数");
        Scanner scan5 = new Scanner(System.in);
        double b = scan5.nextDouble();
        return a * b;
    }

    /**
     * 除法
     */
    public static double divide(double a) {
        System.out.println("请输入一个数");
        Scanner scan6 = new Scanner(System.in);
        double b = scan6.nextDouble();
        if (b == 0) {
            System.out.println("分母不能为0，请重新输入");
        }
        return a / b;
    }

    public void jisuan() {
        System.out.println("请输入一个数");
        /**输入值*/
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        /**循环*/
        while (true) {
            Scanner scan2 = new Scanner(System.in);
            System.out.println("可以输入+—*/来进行计算");
            String str = scan2.nextLine();
            switch (str) {
                case "+":
                    a = sum(a);
                    System.out.println("=" + a);
                    break;
                case "-":
                    a = sub(a);
                    System.out.println("=" + a);
                    break;
                case "*":
                    a = mul(a);
                    System.out.println("=" + a);
                    break;
                case "/":
                    a = divide(a);
                    System.out.println("=" + a);
                    break;
                default:
                    System.out.println("输入的字符有误,请重新输入");
            }
        }
    }
}
