package AnalyzerImplementation;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class AnalyzerMostPopularWords implements Analyzer {


    @Override
    public Map<String, Long> analyze(String text) {

        List<String> listOfString;
        listOfString = Arrays.asList(text.toLowerCase().replaceAll("[^a-zA-Z]+", " ").split(" "));
        Map<String, Long> mapOfPopularString = listOfString.stream().collect(groupingBy(Function.identity(), counting()));

      return   mapOfPopularString.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> {
                            throw new IllegalStateException();
                        },
                        LinkedHashMap::new
                ));

    }


    public static void main(String[] args) {
        AnalyzerMostPopularWords analyzerMostPopularWords = new AnalyzerMostPopularWords();
        System.out.println(analyzerMostPopularWords.analyze("Seb Lub Seb Lub Lub Nie Nie Seb Seb Ni"));
    }
}
