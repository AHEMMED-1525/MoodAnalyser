package com.bridgelabz.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.moodAnalyser.Exception.MoodAnalyserExceptionHandling;

public class MoodAnalyserTest {
	@Test
	public void givenMood_WhenProper_ShouldReturnHappy() throws MoodAnalyserExceptionHandling {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am Happy");
		Assert.assertEquals("happy", mood);
	}

	@Test
	public void givenMood_WhenProper_ShouldReturnSad()  throws MoodAnalyserExceptionHandling{
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am sad");
		Assert.assertEquals("sad", mood);
	}
	@Test
	public void givenMood_WhenProper_ShouldReturnHappyMood() {

		try {
			MoodAnalyser moodAnalyser = new MoodAnalyser();
			String mood = moodAnalyser.analyseMood(null);
		} catch (MoodAnalyserExceptionHandling e) {
			Assert.assertEquals("Please provide correct message",e.getMessage());
			
		}
		
	}
}
