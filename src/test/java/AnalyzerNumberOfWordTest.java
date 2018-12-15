import AnalyzerImplementation.AnalyzerNumberOfWord;
import org.junit.Before;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AnalyzerNumberOfWordTest {
    private AnalyzerNumberOfWord analyzerNumberOfWord;
    @Before
    public void setAnalyzerNumberOfWord(){
        analyzerNumberOfWord =new AnalyzerNumberOfWord();
    }

    @Test
    public void testOfGoodString() {
        int expected =2;
        int actual =analyzerNumberOfWord.analyze("Seb Lub");
        assertEquals(expected, actual);

    }
    @Test
    public void testOfGoodStringWithCharacters() {
        int expected =3;
        int actual =analyzerNumberOfWord.analyze("Seb - Lub");
        assertEquals(expected, actual);
    }
    @Test
    public void testOfEmptyString(){ //??
        int expected =1;
        int actual =analyzerNumberOfWord.analyze("");
        assertEquals(expected, actual);
    }

    @Test
    public void testOfNullString(){
        try {
            analyzerNumberOfWord.analyze(null);
            fail();

        }catch (InputMismatchException | NullPointerException e ){
            System.out.println("Wrong input");
        }
    }
}
