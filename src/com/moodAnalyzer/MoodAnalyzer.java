package com.moodAnalyzer;

public class MoodAnalyzer {
    private String message;
    private String sad;


    public MoodAnalyzer(String message) {
        this.message = message;

    }

    public MoodAnalyzer() {

    }

    public String analyseMood(String message) {

        if (message.contains("sad"))
            return "sad";
        else
            return "Happy";
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser");

    }



    public String analyseMood() {
        return sad;
    }
}
