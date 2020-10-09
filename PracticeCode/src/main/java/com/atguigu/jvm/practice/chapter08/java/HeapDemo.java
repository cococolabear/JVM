package com.atguigu.jvm.practice.chapter08.java;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/7 3:01 下午
 */
public class HeapDemo {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end...");
    }
}
