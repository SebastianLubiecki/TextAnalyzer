
import AnalyzerImplementation.AnalyzerDistributionOfLetters;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class AnalyzerDistributionOfLettersTest {

    private AnalyzerDistributionOfLetters analyzerDistributionOfLetters;

    @Before
    public void setAnalyzerDistributionOfLetters(){
        this.analyzerDistributionOfLetters = new AnalyzerDistributionOfLetters();
    }

    @Test
    public void testOfEmptyString(){
        Map<Character, Double> expected = new HashMap<>();

        Map actual = analyzerDistributionOfLetters.analyze("");
     assertEquals(expected, actual);
    }

    @Test
    public void testOf(){
        Map<Character, Double> expected = new HashMap<>();
        expected.put('s', 0.2);
        expected.put('e', 0.4);
        expected.put('b', 0.2);
        expected.put('k', 0.2);
        Map actual = analyzerDistributionOfLetters.analyze("sebek");
        assertEquals(expected, actual);
    }


}
