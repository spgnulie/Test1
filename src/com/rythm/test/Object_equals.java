package com.rythm.test;

import java.util.*;

public class Object_equals {
	public static void main(String[] args) {
		 
		// Object 使用 hashCode()
        Object obj1 = new Object();
 
        // obj1 赋值给 obj2
        Object obj2 = obj1;
 
        // 判断两个对象是否相等
        System.out.println(obj1.equals(obj2)); // true
 
        // 获取 obj1 与 obj2 的哈希值
        System.out.println(obj1.hashCode()); // 225534817 
        System.out.println(obj2.hashCode()); // 225534817
        
        
        // Object 使用 hashCode()
        Object obj3 = new Object();
        System.out.println(obj3.hashCode()); 
        
     // String 使用 hashCode()
        String str = new String();
        System.out.println(str.hashCode()); // 0
        
        String str1 = "runoobnn";
        System.out.println(str1.hashCode()); // 0
 
        // ArrayList 使用 hashCode()
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.hashCode()); // 1
    }
}
