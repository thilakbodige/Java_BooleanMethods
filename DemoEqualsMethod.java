package com.BooleanMethods;

public class DemoEqualsMethod 
{

	public static void main(String[] args)
	{
		String s ="Hello";
		String s1=new String("Hello");
		System.out.println(s==s1);//Address are Different
		System.out.println(s.equals(s1));//Content is Same

	}

}
