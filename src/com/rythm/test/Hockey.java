package com.rythm.test;

//ÎÄ¼şÃû: Hockey.java
public interface Hockey extends Sports {
	public void homeGoalScored();

	public void visitingGoalScored();

	public void endOfPeriod(int period);

	public void overtimePeriod(int ot);
}