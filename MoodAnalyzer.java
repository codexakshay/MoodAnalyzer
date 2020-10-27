package com.bridgelabz.code;

public class MoodAnalyzer {

	static String message;

	public MoodAnalyzer() {
		super();
	}

	public MoodAnalyzer(String message) {
		super();
		MoodAnalyzer.message = message;
	}

	public static String analyzeability() throws MoodAnalyzerException {
		try {
			if (message.contains("Sad"))
				return "SAD";
		} catch (NullPointerException e) {
			if(message == null) {
				throw new MoodAnalyzerException("Please Enter Proper Message");
			}
			if(message.trim() == "") {
				throw new MoodAnalyzerException("Please Enter Other Than Empty Message");
			}
		}
		return "HAPPY";
	}
}
