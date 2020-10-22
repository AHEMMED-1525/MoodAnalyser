package com.bridgelabz.moodAnalyser;


public class MoodAnalyser {

	public String analyseMood(String message)  {
		try {
		if(message.contains("sad"))
			return "sad";
		}
		catch(NullPointerException e) {
			return "happy";
		}
		return "happy";

	}

}
