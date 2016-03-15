package com.inspur.zhuby.thread.Strategy;

import java.util.concurrent.ExecutorService;


public interface ThreadPoolStrategy {
	public ExecutorService generateThreadPool();
}
