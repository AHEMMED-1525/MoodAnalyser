package com.bridgelabz.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void givenMood_WhenProper_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am Happy");
		Assert.assertEquals("happy", mood);
	}

	@Test
	public void givenMood_WhenProper_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am sad");
		Assert.assertEquals("sad", mood);
	}
	@Test
	public void givenMood_WhenProper_ShouldReturnHappyMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood(null);
		Assert.assertEquals("happy", mood);
	}
}
