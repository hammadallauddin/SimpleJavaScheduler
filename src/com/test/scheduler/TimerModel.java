package com.test.scheduler;

public class TimerModel {

	private int hours;
	private int minutes;
	private int seconds;
	private int day;

	public TimerModel() {
		super();
	}

	public TimerModel(int hours, int minutes, int seconds, int day) {
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		this.day = day;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

}
