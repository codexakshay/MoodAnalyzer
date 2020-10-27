package com.bridgelabz.code;
import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyzerTest {

	static MoodAnalyzer mood;

	@Test
	public void testAnalyzeAbilityMethod_thenAssertionHappy() {
		mood = new MoodAnalyzer("I am in Happy Mood");
		assertEquals("HAPPY", mood.analyzeability());
	}

	@Test
	public void testAnalyzeAbilityMethod_thenAssertionSad() {
		mood = new MoodAnalyzer("I am in Sad Mood");
		assertEquals("SAD", mood.analyzeability());
	}
	
	@Test
	public void testgivenNullMoodShouldReturnHappy_thenAssertionHappy() {
		mood = new MoodAnalyzer();
		assertEquals("HAPPY", mood.analyzeability());
	}
}
