package org.example;
//import org.junit.jupiter.api.
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyzerTest {

    @Test
    void analyzeMood()throws InvalidMoodAnalyser{
        MoodAnalyzer moodAnalyzer1 = new MoodAnalyzer("I am in sad mood");
        String mood = moodAnalyzer1.analyzeMood();
        Assertions.assertEquals(mood,"SAD");
    }

    @Test
    void analyzeHappyMood()throws InvalidMoodAnalyser {
        MoodAnalyzer moodAnalyzer2 = new MoodAnalyzer("I am in Happy   mood".toLowerCase());
        String mood = moodAnalyzer2.analyzeMood();
        Assertions.assertEquals(mood,"HAPPY");
    }

    @Test
    void analyzeInvalidMood() throws InvalidMoodAnalyser{
        MoodAnalyzer moodAnalyzer2 = new MoodAnalyzer(null);
        String mood = moodAnalyzer2.analyzeMood();
        Assertions.assertEquals(mood,"NULL");
    }
}