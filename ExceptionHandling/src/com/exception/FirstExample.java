package com.exception;

public class FirstExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = null;
		try{
			System.out.println("String lentgh: " +s.length());
			
			
		}
		catch(NullPointerException e)
		{
			System.err.println("String value is null - check");
			System.err.println(e.getMessage());
			
		}
		finally{
			System.out.println("this message is in finally block");
		}
		System.out.println("bye..");
	}

}
