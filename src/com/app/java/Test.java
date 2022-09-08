package com.app.java;

public class Test {

	public void showMsg(String s)
	{
		System.out.println(s);
	}
	
	public String getMsg()
	{
		return "java is opensource";
	}
	public static void main(String[] args) {
		
		Test t=new Test();
		
		t.showMsg("welcome to java");
		
		System.out.println(t.getMsg());
	}
}
