/**
 * 
 */
package org.lyh.mythreadtest.service;

import org.lyh.mythreadtest.thread.MyThread;

/**
 * @author 刘渝洪
 *
 */
public class MyService {
	public void runThread(int stopFlag) {
		MyThread.stopSwith = stopFlag;
		if(stopFlag == 0) {
			Thread thread = new Thread(new MyThread());
			thread.start();
		}
	}
}
