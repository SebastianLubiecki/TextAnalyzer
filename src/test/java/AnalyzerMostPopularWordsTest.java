import AnalyzerImplementation.AnalyzerMostPopularWords;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnalyzerMostPopularWordsTest {
    AnalyzerMostPopularWords analyzerMostPopularWords;

    @Before
    public void setAnalyzerMostPopularWords() {
        analyzerMostPopularWords = new AnalyzerMostPopularWords();
    }

    @Test
    public void testOfEmptyString() {
        List expected = new ArrayList();
        List<String> actual = analyzerMostPopularWords.analyze("");
        assertEquals(expected, actual);
    }

    @Test
    public void testOfGoodString() {
        List<String> expected = new ArrayList<>();
        expected.add("Seb");
        expected.add("Lub");
        List<String> actual = analyzerMostPopularWords.analyze("Seb Seb Lub");
        assertEquals(expected, actual);
    }

    @Test
    public void testOfGoodStringWithComa() {
        List<String> expected = new ArrayList<>();
        expected.add("Seb");
        expected.add("Lub");
        List<String> actual = analyzerMostPopularWords.analyze("Seb, Seb Lub,");
        assertEquals(expected, actual);
    }
}
