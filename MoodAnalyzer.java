package com.bridgelabz.code;

public class MoodAnalyzer {
	public String analyzeability(String message) {
		if (message.contains("SAD"))
			return "SAD";
		return "HAPPY";
	}
}