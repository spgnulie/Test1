package com.runoob.test;
import java.io.*;
import java.rmi.RemoteException;
public class Throwtest {
	  public void deposit(double amount) throws RemoteException
	  {
	    // Method implementation
	    throw new RemoteException();
	  }
	  //Remainder of class definition
}
