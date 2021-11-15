package com.moodAnalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {


    private String mood;

    @Test

    public void iAmin_SadMood_ShouldReturn_sad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("i am in in sad mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("sad",mood);
    }
    @Test
    public void iAmIn_anyMood_ShouldReturn_happy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("i am any mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("Happy", mood);
    }
    @Test
    public void null_Should_Return_Happy_Mood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        Assert.assertEquals("Happy", mood);
    }
}
