package com.test.scheduler;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class SchedulerMain {
	public static void main(String[] args) {
		System.out.println("Working");

		// more attributes can be added below for desired trigger of function
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 00); // 24 hours format
		calendar.set(Calendar.MINUTE, 6);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		Date time = calendar.getTime();

		Scheduler scheduler = new Scheduler();
		Timer t = new Timer();
		t.schedule(scheduler, time); // call function at time defined above
	}
}
