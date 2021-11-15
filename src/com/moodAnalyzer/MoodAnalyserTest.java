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
    // Method to test if the mood is
    @Test
    public void whenTestedMood_ifHappy_shouldReturnHappy(){
        String mood = moodAnalyzer.analyseMood("Happy Days");
        Assert.assertEquals("Happy" , mood);

    }
    @Test
    public void  whenTestedMood_ifNotIMood_shouldReturnHappy(){
        String mood = moodAnalyzer.analyseMood("i am not in a mood");
        Assert.assertEquals("Happy", mood);
    }
}
