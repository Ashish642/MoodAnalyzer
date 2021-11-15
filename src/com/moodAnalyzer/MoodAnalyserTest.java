package com.moodAnalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {


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
}
