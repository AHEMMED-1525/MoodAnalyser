package com.bridgelabz.moodAnalyser;


public class MoodAnalyser {

	public String analyseMood(String message)  {

		if(message.contains("sad"))
			return "sad";
		

		return "happy";

	}

}
