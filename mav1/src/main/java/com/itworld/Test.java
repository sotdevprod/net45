package com.itworld;

import javax.swing.JFrame;
import java.sql.Connection;

public class Test
{  
  	public static void main(String args[])throws Exception
  	{    		
      		System.out.println(String.class.getModule());
      		System.out.println(JFrame.class.getModule());
      		System.out.println(Connection.class.getModule());    
      		System.out.println(Test.class.getModule());
  	}  
}  
