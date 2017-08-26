package com.yili.service;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
	
	private Lock lock = new ReentrantLock();
	
	public void fun1(){
		lock.lock();
		
	}
	
	public void fun2(){
		lock.unlock();
	}
}
