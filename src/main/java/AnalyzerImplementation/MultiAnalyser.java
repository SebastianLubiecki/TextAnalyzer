package AnalyzerImplementation;

import AnalyzerImplementation.Analyzer;

import java.util.ArrayList;

class MultiAnalyser {

    private final ArrayList<Analyzer> analyzers;
    MultiAnalyser(ArrayList<Analyzer> analyzers){
        this.analyzers = analyzers;
    }

    public void performAnalyzis(String text){ //void? or collection
        for(Analyzer analizer: analyzers){
            analizer.analyze(text);
        }
    }

}