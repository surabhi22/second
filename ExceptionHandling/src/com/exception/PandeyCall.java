package com.exception;


public class PandeyCall {
	
	public static void main(String args[])
	{
		Book b=null,b2=null,b3=null;
		try{ b = new Book(101, "Pandey biography", "suru", 5000);
		
		 b2 = new Book(102, "positive pandey", "suru", 4000);
		
		 b3 = new Book(103, "pandey", "suru", 2000);
		
		System.out.println(b.equals(b2));
		System.out.println("book 1 : "+b.hashCode());
		System.out.println("book 2 : "+b2.hashCode());
		
		String s = new String("suru");
		
		System.out.println("comparing objects of diff classes : " +s.equals(b));
		
		Book b4 = b2;
		
		System.out.println("checking identity : "+b4.equals(b2));
		}catch(RangeCheckException e){
			System.err.println(e.getMessage());
			e.printStackTrace();
			
		}
	}


}
