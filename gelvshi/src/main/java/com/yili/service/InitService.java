package com.yili.service;


public class InitService {
	
	private int a;
	private int b;
	private static String sa;
	
	{
		System.out.println(" a= " + a + "   b=" + b);
		a=1;
		b=2;
		System.out.println(" a= " + a + "   b=" + b);
	}

	public InitService() {
		super();
		this.a = 3;
		this.b = 4;
	}

	@Override
	public String toString() {
		System.out.println(sa);
		return "InitService [a=" + a + ", b=" + b + "]";
	}


	public static void main(String[] args) {
		double b = 0.1 * 4;
		long a = 4 * 3l;
		System.out.println(2*0.1);
		
		TestLock tl = new TestLock();
		
		tl.fun1();
		tl.fun2();
		
		
	}
	
	

}
