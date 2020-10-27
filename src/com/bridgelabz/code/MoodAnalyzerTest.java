package com.bridgelabz.code;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

	static MoodAnalyzer mood;

	@Test
	public void testanalyzeabilityMethod_thenAssertionHappy() {
		mood = new MoodAnalyzer("I am in Happy Mood");
		try {
			assertEquals("HAPPY", MoodAnalyzer.analyzeability());
		} catch (MoodAnalyzerException e) {
		}
	}

	@Test
	public void testanalyzeabilityMethod_thenAssertionSad() {
		mood = new MoodAnalyzer("I am in Sad Mood");
		try {
			assertEquals("SAD", MoodAnalyzer.analyzeability());
		} catch (MoodAnalyzerException e) {
		}
	}

	@Test
	public void testgivenNullMoodShouldReturnHappy_thenAssertionHappy() {
		mood = new MoodAnalyzer(null);
		try {
			assertEquals("HAPPY", MoodAnalyzer.analyzeability());
		} catch (MoodAnalyzerException e) {
		}
	}

	@Test
	public void testgivenNullMoodShouldThrowMoodAnalysis_thenAssertionHappy() {
		mood = new MoodAnalyzer(null);
		try {
			MoodAnalyzer.analyzeability();
		} catch (MoodAnalyzerException e) {
			Assert.assertEquals("Please Enter Proper Message", e.getMessage());
			e.printStackTrace();
		}
	}

	@Test
	public void testgivenEmptyMoodShouldThrowMoodAnalysis_thenAssertionHappy() {
		mood = new MoodAnalyzer(" ");
		try {
			MoodAnalyzer.analyzeability();
		} catch (MoodAnalyzerException e) {
			Assert.assertEquals("Please Enter Other Than Empty Message", e.getMessage());
			e.printStackTrace();
		}
	}
}