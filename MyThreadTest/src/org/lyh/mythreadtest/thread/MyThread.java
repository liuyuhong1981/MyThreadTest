/**
 * 
 */
package org.lyh.mythreadtest.thread;

/**
 * @author 刘渝洪
 * 
 */
public class MyThread implements Runnable {
	public static int stopSwith = 0;// 停止开关，0：运行，1：停止

	@Override
	public void run() {
		System.out.println("start running...");
		while (checkStopSwith()) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean checkStopSwith() {
		if (stopSwith != 0) {
			System.out.println("stop running!!!!!!");
			return false;
		} else {
			System.out.println("still running...");
			return true;
		}
	}
}
