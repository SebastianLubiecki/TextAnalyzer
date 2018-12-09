import AnalyzerImplementation.AnalyzerLongestWordInText;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AnalyzerLongestWordInTextTest {

   private AnalyzerLongestWordInText analyzerLongestWordInText;

    @Before
    public void setAnalyzerLongestWordInText() {
        analyzerLongestWordInText = new AnalyzerLongestWordInText();
    }

    @Test
    public void testOfGoodStringOnInput() {
        Map<String, Integer> mapWithStringValue = new HashMap<>();
        mapWithStringValue.put("Seb", 4);
        mapWithStringValue.put("Lub", 3);
        assertEquals(analyzerLongestWordInText.analyze("Seb Lub Lub Seb Seb Lub Seb"), mapWithStringValue);
    }

    @Test
    public void testOfEmptyStringOnInput() {
        Map<String, Integer> mapWithStringValue = new HashMap<>();
        assertEquals(analyzerLongestWordInText.analyze(""), mapWithStringValue);
    }

    @Test
    public void testOfNullString(){

        try {
            analyzerLongestWordInText.analyze(null);
            fail();
        }catch (InputMismatchException e){
            System.out.println("Wrong input");
        }
    }

}
