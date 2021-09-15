package com.runoob.test;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Test_arraylist {
	  public static void main(String[] args) {
	        ArrayList<String> sites = new ArrayList<String>();
	        sites.add("Google");
	        sites.add("Runoob");
	        sites.add("Aaaaa");
	        sites.add("Taobao");
	        sites.add("Weibo");
	        System.out.println(sites);
	        System.out.println(sites.get(1));  // 访问第二个元素
	        sites.set(1, "Wiki"); // 第一个参数为索引位置，第二个为要修改的值
	        System.out.println(sites);
	        sites.remove(4); // 删除第四个元素
	        System.out.println(sites);
	        System.out.println(sites.size());
	        Collections.sort(sites);
//	        for (int i = 0; i < sites.size(); i++) {
//	            System.out.println(sites.get(i));
//	        }
//	        for (String i : sites) {
//	            System.out.println(i);
//	        }
	        //第一种遍历方法使用 For-Each 遍历 List
	        System.out.println("第一种遍历方式：");
	        for (String str : sites) {            //也可以改写 for(int i=0;i<list.size();i++) 这种形式
	           System.out.println(str);
	        }
	      //第三种遍历 使用迭代器进行相关遍历
	        System.out.println("第三种遍历方式：");
	        Iterator<String> ite=sites.iterator();
	        while(ite.hasNext())//判断下一个元素之后有值
	        {
	            System.out.println(ite.next());
	        }
	        //第二种遍历，把链表变为数组相关的内容进行遍历
	        System.out.println("第二种遍历方式：");
	        String[] strArray=new String[sites.size()];
	        sites.toArray(strArray);
	        for(int i=0;i<strArray.length;i++) //这里也可以改写为  for(String str:strArray) 这种形式
	        {
	           System.out.println(strArray[i]);
	        }
	        
	       
//	        System.out.println(sites);
	        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	        myNumbers.add(10);
	        myNumbers.add(15);
	        myNumbers.add(20);
	        myNumbers.add(25);
	        Collections.sort(myNumbers);
	        for (int i : myNumbers) {
	            System.out.println(i);
	        }
	        
	    }
}
