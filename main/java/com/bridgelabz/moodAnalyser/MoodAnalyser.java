package com.bridgelabz.moodAnalyser;

import com.bridgelabz.moodAnalyser.Exception.MoodAnalyserExceptionHandling;

public class MoodAnalyser {

	public String analyseMood(String message) throws MoodAnalyserExceptionHandling  {
		try {
		if(message.contains("sad"))
			return "sad";
		}
		catch(NullPointerException e) {
			throw new MoodAnalyserExceptionHandling("Please provide correct message");
		}
		return "happy";

	}

}
