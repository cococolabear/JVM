package com.atguigu.jvm.practice.chapter05.java;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 2:26 下午
 */
public class StackTest {
    public static void main(String[] args) {
        StackTest test = new StackTest();
        test.methodA();
    }

    public void methodA() {
        int i = 10;
        int j = 20;
        methodB();
    }

    public void methodB() {
        int k = 30;
        int m = 40;
    }
}
