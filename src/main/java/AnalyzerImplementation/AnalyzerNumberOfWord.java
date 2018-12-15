package AnalyzerImplementation;


import java.util.Arrays;
import java.util.List;

public class AnalyzerNumberOfWord implements Analyzer {

    @Override
    public Integer analyze(String text) {

        Integer numberOfWord;
        List<String> arrayOfString;
        arrayOfString = Arrays.asList(text.split(" "));
        numberOfWord = arrayOfString.size();

        return numberOfWord;
    }


    public static void main(String[] args) {
        AnalyzerNumberOfWord analyzerNumberOfWord = new AnalyzerNumberOfWord();
        System.out.println(analyzerNumberOfWord.analyze("23 4354 fdf sdf dfs ewdfd dfdsf"));
    }
}
