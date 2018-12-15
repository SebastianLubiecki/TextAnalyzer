import AnalyzerImplementation.AnalyzerMostPopularWords;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class AnalyzerMostPopularWordsTest {

    private AnalyzerMostPopularWords analyzerMostPopularWords;

    @Before
    public void setAnalyzerMostPopularWords() {
        analyzerMostPopularWords = new AnalyzerMostPopularWords();
    }

    @Test
    public void testOfEmptyString() {
        Map<String,Long > expected = new HashMap<>();
        Map<String, Long> actual = analyzerMostPopularWords.analyze("=1");
        assertEquals(expected, actual);
    }

    @Test
    public void testOfGoodString() {
        Map<String,Long > expected = new HashMap<>();
        expected.put("seb", (long) 2);
        expected.put("lub", (long) 1);
        Map<String, Long> actual = analyzerMostPopularWords.analyze("Seb Seb Lub");
        assertEquals(expected, actual);
    }

    @Test
    public void testOfGoodStringWithComa() {
        Map<String,Long > expected = new HashMap<>();
        expected.put("seb", (long) 2);
        expected.put("lub", (long) 1);
        Map<String, Long> actual = analyzerMostPopularWords.analyze("Seb, Seb Lub,");
        assertEquals(expected, actual);
    }
}
