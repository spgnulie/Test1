package com.runoob.test;

public class AbstractDemo {
//	 public static void main(String [] args)
//	   {
//	      /* 以下是不允许的，会引发错误 */
////	      Employee1 e = new Employee1("George W.", "Houston, TX", 43);
//	 
//	      System.out.println("\n Call mailCheck using Employee reference--");
////	      e.mailCheck();
//	    }

	public static void main(String[] args) {
		Salary1 s = new Salary1("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
		Employee1 e = new Salary1("John Adams", "Boston, MA", 2, 2400.00);

		System.out.println("Call mailCheck using Salary reference --");
		s.mailCheck();

		System.out.println("\n Call mailCheck using Employee reference--");
		e.mailCheck();
	}
}
