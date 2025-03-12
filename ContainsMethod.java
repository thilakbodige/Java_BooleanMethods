package com.BooleanMethods;
import java.util.*;
public class ContainsMethod 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String mail=sc.next();
	if(mail.contains("@gmail.com")) 
	{
		System.out.println("Valid Gmail Id");
	}
		else	
		{
			System.out.println("In Valid Gmail.Id");
		}
	}

	}