package com.test.scheduler;

import java.util.TimerTask;

public class Scheduler extends TimerTask {

	private String name = "Hammad Here";

	@Override
	public void run() {
		System.out.println("Call function here");
	}
}
