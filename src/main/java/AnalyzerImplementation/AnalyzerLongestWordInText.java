package AnalyzerImplementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnalyzerLongestWordInText implements Analyzer {


    @Override
    public List analyze(String text) {
        List<String> listOfString = new ArrayList<String>();
       // List<String>listOfSortedList = new ArrayList<>();
        listOfString = Arrays.asList(text.split("[ .,]"));
        return listOfString.stream()
                .distinct()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(10)
                .collect(Collectors.toList());

    }

    public static void main (String[]args){
     AnalyzerLongestWordInText analyzerLongestWordInText = new AnalyzerLongestWordInText();
        System.out.println(analyzerLongestWordInText.analyze("Sebeeee Lub Sebe, Lubbfr Lub Ndssie. Nie Seb Seb Ni"));
    }
}
