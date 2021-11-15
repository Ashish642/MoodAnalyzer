package com.moodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

    // Method to test if the mood is sad
    @Test
    public void whenTestedMood_ifSad_shouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("sad", mood);

    }
}
