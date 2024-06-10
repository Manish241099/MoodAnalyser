package org.example;

public class MoodAnalyzer {



    private String msg;

    public MoodAnalyzer(String msg) {
        this.msg = msg;
    }

    public String validate()throws InvalidMoodAnalyser {
        if (msg.contains("sad")) {
//            return String.valueOf(Mood.SAD);
            return "SAD";

        } else if (msg.contains("happy")) {

            return "HAPPY";
        } else if (msg == null) {
            throw new InvalidMoodAnalyser("Invalid ");

        } else {
            return msg;
        }

    }

    public String analyzeMood() {
        try {
          return validate();

        } catch (InvalidMoodAnalyser e) {
            System.out.println("Exception " + e);
            System.out.println("catch the exception");
        }
        return msg;

    }
}



