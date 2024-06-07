package org.example;

enum Mood {
    HAPPY, SAD;
}

public class MoodAnalyzer {

    enum Mood {
        HAPPY, SAD;
    }
    private String msg;

    public MoodAnalyzer(String msg) {
        this.msg = msg;
    }

    public String analyzeMood() throws InvalidMoodAnalyser {
        try {
            if (msg.contains("sad")) {
                return String.valueOf(Mood.SAD);
            } else {
                return String.valueOf(Mood.HAPPY);
            }
        } catch (Exception e) {
            throw new InvalidMoodAnalyser("Invalid ");
        }
    }
}
