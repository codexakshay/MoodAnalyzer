package com.bridgelabz.code;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyzerTest {

	static MoodAnalyzer mood;

	@BeforeClass
	public static void createMoodAnalyserObj() {
		mood = new MoodAnalyzer();
	}

	@AfterClass
	public static void nullObj() {
		mood = null;
	}

	@Test
	public void testAnalyzeAbilityMethod_thenAssertionHappy() {
		assertEquals("HAPPY", mood.analyzeability("I am in Happy Mood"));
	}

	@Test
	public void testAnalyzeAbilityMethod_thenAssertionSad() {
		assertEquals("SAD", mood.analyzeability("I am in Sad Mood"));
	}
}