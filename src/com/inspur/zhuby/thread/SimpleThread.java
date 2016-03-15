package com.inspur.zhuby.thread;

public class SimpleThread extends Thread {
	private String name = null;
	
	public SimpleThread(String name) {
		this.name = name;
		System.out.println(Thread.currentThread().getName() + " : new Simple thread, name is " + name);
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " RUN, name is " + name);
	}
	
	
	
}
