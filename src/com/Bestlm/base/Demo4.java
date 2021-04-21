package com.bestlm.base;

import java.util.Scanner;

public class Demo4 {
   //计算器
   public static void main(String[] args) {
       //Scanner
       System.out.println("请输入第一个数字");
       Scanner scan = new Scanner(System.in);
       double num1 = scan.nextDouble();
       System.out.println("请输入第二个数字");
       double num2 = scan.nextDouble();
       Scanner yunsuanfu = new Scanner(System.in);
       System.out.println("选择运算模式");
       System.out.println("1:加法运算");
       System.out.println("2:减法运算");
       System.out.println("3:乘法运算");
       System.out.println("4:除法运算");
       int i = yunsuanfu.nextInt();
       switch (i) {
           //加法
           case 1:
               System.out.println("加法运算");
               System.out.println("两数之和为："+sum(num1,num2));
               break;
           case 2:
               System.out.println("减法运算");
               System.out.println("两数之差为："+sub(num1,num2));
                break;
           case 3:
               System.out.println("乘法运算");
               System.out.println("两数之积为："+mul(num1,num2));
               break;
           case 4:
               System.out.println("除法运算");
               System.out.println("两数之商为："+div(num1,num2));
               break;
       }
   }
   //加法方法
   public static double sum(double num1,double num2){
       return num1+num2;
   }
   //减法方法
    public static double sub(double num1,double num2){
       return num1-num2;
    }
    //乘法方法
    public static double mul(double num1,double num2){
       return num1*num2;
    }
    //除法方法
    public static double div(double num1,double num2){
       return num1/num2;
    }
   }

