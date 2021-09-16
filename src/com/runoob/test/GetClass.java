package com.runoob.test;
import java.util.ArrayList;

public class GetClass {
    public static void main(String[] args) {
 
    // getClass() with Object
    Object obj1 = new Object();
    System.out.println("obj1 的类为: " + obj1.getClass());
 
    // getClass() with String
    String obj2 = new String();
    System.out.println("obj2 的类为: " + obj2.getClass());
 
    // getClass() with ArrayList
    ArrayList<Integer> obj3 = new ArrayList<>();
    System.out.println("obj3 的类为: " + obj3.getClass());
    }
}