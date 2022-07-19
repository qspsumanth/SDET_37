package com.TYSS.Practice;

import org.testng.annotations.Test;

public class Practice_1Test {

	@Test (priority = 0) 
	public void test() {
		String url = System.getProperty("url");
		String browser = System.getProperty("Browser");
		String username = System.getProperty("UserName");
		String password = System.getProperty("Password");
		System.out.println(url);
		System.out.println(browser);
		System.out.println(username);
		System.out.println(password);
		int a=10;
		int b=20;
		int res=a+b;
		System.out.println(res);
	}
	@Test(invocationCount = 2,priority = 0)
	public void test1() {
		int a=10;
		int b=20;
		int res=a*b;
		System.out.println(res);
	}
	@Test(enabled = false)
	public void test2() {
		int a=100;
		int b=10;
		int c=a/b;
		System.out.println(c);
	}
	@Test
	public void test3()
	{
		System.out.println("hello1");
		System.out.println("BiiiiiiiHiiiiiiiihello")
	}
	

}
