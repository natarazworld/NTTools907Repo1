package com.nt.main;

import com.nt.service.Arithmetic;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
          Arithmetic  ar=new Arithmetic();
          int result=ar.sub(100, 200);
          System.out.println("result is ::"+result);
    }
}
