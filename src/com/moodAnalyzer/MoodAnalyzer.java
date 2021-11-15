package com.moodAnalyzer;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(String message) {
        this.message = message;

    }
    public String analyseMood()  throws MoodAnalyzerException {
        try {
            if (message.contains("sad"))
                return "sad";
            else
                return "Happy";

        } catch (NullPointerException exception) {
            throw new  MoodAnalyzerException("please enter valid message");

        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to mood analyser");
    }

    public class MoodAnalyzerException extends Exception {
        public MoodAnalyzerException(String please_enter_valid_message) {

        }
    }
}
