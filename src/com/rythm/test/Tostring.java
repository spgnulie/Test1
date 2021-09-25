package com.rythm.test;

public class Tostring {
	 public static void main(String[] args) {
		 
	        // toString() with Object
	        Object obj1 = new Object();
	        System.out.println(obj1.toString());
	 
	        Object obj2 = new Object();
	        System.out.println(obj2.toString());
	 
	        Object obj3 = new Object();
	        System.out.println(obj3.toString());
	        
	        // toString() with array
	        // 创建数组
	        String[] array = { "Google", "Runoob", "Taobao" };
	        System.out.println(array[0].toString());
	 
	        // 数组元素值返回一个字符串的表示形式
	        // Array 继承了 Object 类，所以可以直接使用 toString() 方法
	        System.out.println(array[1].toString()); // Runoob
	    }
}
