package org.example;
//import org.junit.jupiter.api.
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyzerTest {
    @Test
    void analyzeMood()
    {
    MoodAnalyzer MA=new MoodAnalyzer();
    String result = MA.analyseMood("sad");
    Assertions.assertEquals(result,"SAD");
    }
}