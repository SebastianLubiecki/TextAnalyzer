import AnalyzerImplementation.AnalyzerLongestWordInText;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

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
        List <String> listOfString = new ArrayList<>();
        listOfString.add("Seb");
        listOfString.add("Lub");
        assertEquals(analyzerLongestWordInText.analyze("Seb Lub Lub Seb Seb Lub Seb"), listOfString);
    }

    @Test
    public void testOfEmptyStringOnInput() {
        List <String> listOfString = new ArrayList<>();
        listOfString.add("");
        assertEquals(analyzerLongestWordInText.analyze(""), listOfString);
    }

    @Test
    public void testOfNullString(){

        try {
            analyzerLongestWordInText.analyze(null);
            fail();
        }catch (InputMismatchException  | NullPointerException e){
            System.out.println("Wrong input");
        }
    }

}
