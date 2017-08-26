package com.yili.service;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " at begin ");
		Thread t1 = new Thread(new Runnable(){
			public void run() {
				System.out.println(" Thread t1 stats");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread t1 ends");
			}
		});
		
		t1.start();
		t1.join();// t1调用join();t1会wait(0),那么t1是如何让main线程等待的呢
		
		System.out.println(Thread.currentThread().getName() + " at end ");
	}
}

//final Thread t3 = new Thread(new Runnable() {
//	public void run() {
//		System.out.println(Thread.currentThread().getName() + "  before sleep " );
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println(Thread.currentThread().getName() + "  after sleep " );
//	}
//});
//final Thread t2 = new Thread(new Runnable() {
//	public void run() {
//		System.out.println(Thread.currentThread().getName() + "  before sleep " );
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println(Thread.currentThread().getName() + "  after sleep " );
//		try {
//			t3.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//});
//Thread t1 = new Thread(new Runnable() {
//	public void run() {
//		System.out.println(Thread.currentThread().getName() + "  before sleep " );
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println(Thread.currentThread().getName() + "  after sleep " );
//		try {
//			t2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//});
//
//t1.start();
