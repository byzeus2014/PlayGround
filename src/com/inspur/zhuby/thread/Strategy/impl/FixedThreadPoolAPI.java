package com.inspur.zhuby.thread.Strategy.impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.inspur.zhuby.thread.Strategy.ThreadPoolStrategy;

public class FixedThreadPoolAPI implements ThreadPoolStrategy{
	private int threadNumber = 1;
	
	public FixedThreadPoolAPI(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	@Override
	public ExecutorService generateThreadPool() {
		ExecutorService es = Executors.newFixedThreadPool(threadNumber);
		return es;
	}

}
