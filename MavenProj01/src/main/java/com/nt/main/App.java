package com.nt.main;

import com.nt.service.ArithmeticService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!-1231");
        ArithmeticService  service=new ArithmeticService();
        System.out.println(" sum result is ::"+service.sum(100, 200));
        System.out.println("sub  result  is ::"+service.sub(100, 200));
    }
}
