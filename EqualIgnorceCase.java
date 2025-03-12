package com.BooleanMethods;
import java.util.*;
public class EqualIgnorceCase 
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Read the Question Carefully");
System.out.println("******Sun Rise in the East******");
System.out.println("Enter Wheather it is true or false");
String ans=sc.next();
if(ans.equalsIgnoreCase("true"))//ans.equals("true")) Output we enter True it gives(INcorrect)
{
	System.out.println("It is Correct");
}
else
{
	System.out.println("It is InCorrect");
}
	}

}
