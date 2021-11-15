package com.moodAnalyzer;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(String message) {
        this.message = message;

    }
    public String analyseMood() {
        try {
            if (message.contains("sad"))
                return "sad";
            else
                return "Happy";

        } catch (NullPointerException exception) {
            return "Happy";

        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to mood analyser");
    }
}
