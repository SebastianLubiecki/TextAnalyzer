package AnalyzerImplementation;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class AnalyzerDistributionOfLetters implements Analyzer {

    @Override
    public Map<Character, Double> analyze(String text) {

        Map<Character, Double> doubleMap = new HashMap<>();
        Set<Character> setOfLetters = new LinkedHashSet<>();


        char[] charArray = text.replaceAll("[^a-zA-Z]", "").toCharArray();

        double temp;

        for (int i = 0; i < charArray.length; i++) {
            if (!doubleMap.containsKey(charArray[i])) {
                doubleMap.put(charArray[i], 1.0);
            } else {
                temp = doubleMap.get(charArray[i]);
                temp = temp + 1;
                doubleMap.put(charArray[i], temp);
            }
            setOfLetters.add(charArray[i]);
        }
        Object[] arrayOfCharacters = setOfLetters.toArray();
        for (int i = 0; i < setOfLetters.size(); i++) {
            double temp2;
            temp2 = doubleMap.get(arrayOfCharacters[i]);
            temp2 = temp2 / charArray.length;
            doubleMap.put((Character) arrayOfCharacters[i], temp2);
        }

        return doubleMap;
    }
}
