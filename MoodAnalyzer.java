package com.bridgelabz.code;

public class MoodAnalyzer {

	String message;

	public MoodAnalyzer() {
		super();
	}

	public MoodAnalyzer(String message) {
		super();
		this.message = message;
	}

	public String analyzeability() {
		if (message.contains("SAD"))
			return "SAD";
		return "HAPPY";
	}
}
