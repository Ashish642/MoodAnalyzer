package com.moodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

    // Method to test if the mood is sad
    @Test
    public void whenTestedMood_ifSad_shouldReturnSad() {
        String mood = moodAnalyzer.analyseMood("I am sad");
        Assert.assertEquals("sad", mood);

    }
    @Test
    public void whenTestedMood_ifHappy_shouldReturnHappy() {
        String mood = moodAnalyzer.analyseMood("Happy Days");
        Assert.assertEquals("Happy", mood);

    }
    // Method to test no mood is given
    @Test
    public void whenTestedMood_ifNoInAnyMood_shouldReturnHappy() {
        String mood = moodAnalyzer.analyseMood("I am not in a mood");
    }
}
