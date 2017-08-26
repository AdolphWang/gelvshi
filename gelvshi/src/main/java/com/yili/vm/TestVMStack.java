package com.yili.vm;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class TestVMStack {
	
	public static void main(String[] args) throws Throwable {
		ClassA ca = new ClassA();
		SoftReference<ClassA> sra = new SoftReference<ClassA>(ca);
		WeakReference<ClassA> wra = new WeakReference<ClassA>(ca);
		PhantomReference<ClassA> pra = new PhantomReference<ClassA>(ca, null);
		try{
			ca.fun1();
		}catch(Throwable e){
			System.out.println(ca.getLenght());
			throw e;
		}
		
	}
}

class ClassA{
	
	private int lenght = 1;

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	
	
	public void fun1(){
		this.lenght ++;
		this.fun1();
	}
}
