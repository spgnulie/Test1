package com.runoob.test;

public class Employee3 implements java.io.Serializable
{
   public String name;
   public String address;
   public  int SSN;
   public int number;
   public void mailCheck()
   {
      System.out.println("Mailing a check to " + name
                           + " " + address);
   }
}