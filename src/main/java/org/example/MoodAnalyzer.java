package org.example;

public class MoodAnalyzer {

public enum Mood{
    HAPPY,SAD,NULL,EMPTY;
    }

    private String msg;

    public MoodAnalyzer(String msg) {
        this.msg = msg;
    }

    public String validate()throws InvalidMoodAnalyser {
        if (msg == null) {
            return String.valueOf(Mood.NULL);
        } else if (msg==" ") {
            return String.valueOf(Mood.EMPTY);

        } else if (msg.contains("sad")) {
            return String.valueOf(Mood.SAD);


        } else if (msg.contains("happy")) {

            return String.valueOf(Mood.HAPPY);
        }
       else {
            throw new InvalidMoodAnalyser("Invalid ");
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



