package com.test.scheduler;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Timer;

public class SchedulerMain {
	public static void main(String[] args) {
		System.out.println("Working");
		List<TimerModel> scheduledTimes = new ArrayList<>();

		scheduledTimes.add(new TimerModel(9, 30, 00, Calendar.THURSDAY));
		scheduledTimes.add(new TimerModel(10, 00, 00, Calendar.THURSDAY));
		scheduledTimes.add(new TimerModel(14, 00, 00, Calendar.THURSDAY));
		scheduledTimes.add(new TimerModel(16, 00, 00, Calendar.THURSDAY));
		scheduledTimes.add(new TimerModel(19, 00, 00, Calendar.THURSDAY));
		scheduledTimes.add(new TimerModel(22, 00, 00, Calendar.THURSDAY));

		scheduledTimes.add(new TimerModel(9, 30, 00, Calendar.FRIDAY));
		scheduledTimes.add(new TimerModel(10, 00, 00, Calendar.FRIDAY));
		scheduledTimes.add(new TimerModel(14, 00, 00, Calendar.FRIDAY));
		scheduledTimes.add(new TimerModel(16, 00, 00, Calendar.FRIDAY));
		scheduledTimes.add(new TimerModel(19, 00, 00, Calendar.FRIDAY));
		scheduledTimes.add(new TimerModel(22, 00, 00, Calendar.FRIDAY));

		for (TimerModel scheduledTime : scheduledTimes) {
			// more attributes can be added below for desired trigger of function
			Calendar calendar = Calendar.getInstance();
			calendar.set(Calendar.HOUR_OF_DAY, scheduledTime.getHours()); // 24 hours format
			calendar.set(Calendar.MINUTE, scheduledTime.getMinutes());
			calendar.set(Calendar.SECOND, scheduledTime.getSeconds());
			calendar.set(Calendar.DAY_OF_WEEK, scheduledTime.getDay());

			Date time = calendar.getTime();
			Scheduler scheduler = new Scheduler();

			System.out.println(time);
			Timer t = new Timer();
			t.schedule(scheduler, time); // call function at time defined above
		}
	}
}
