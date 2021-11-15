package com.moodAnalyzer;

public class MoodAnalyzer {


    public static String analyseMood(String message) {
        if (message.contains("sad"))
            return "sad";
        else
            return "Happy";

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser");
        String message = "I am sad";
        System.out.println(analyseMood(message));
    }



}
