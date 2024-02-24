package com.prowings.hashtable;

public class ExceptionDemo {
	
	public static void main(String[] args) 
	{
		
		int[] nums = {10,20,30};
		
		int i =10;
		int j = 10;
		
		int res = 0;
		try
		{
			res = nums[2]/(i-j);
		}
		finally
		{
			System.out.println("exception occured...");
			
			System.out.println(res);
		}
	
		
		
	}

}
