package com.microservices.enduser.models;

import java.util.Map;

public class Grade {
    public Map<String, Double> getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(Map<String, Double> mathGrade) {
        this.mathGrade = mathGrade;
    }

    public Map<String, Double> getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(Map<String, Double> englishGrade) {
        this.englishGrade = englishGrade;
    }

    public Map<String, Double> getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(Map<String, Double> historyGrade) {
        this.historyGrade = historyGrade;
    }

    public Map<String, Double> getScienceGrade() {
        return scienceGrade;
    }

    public void setScienceGrade(Map<String, Double> scienceGrade) {
        this.scienceGrade = scienceGrade;
    }

    public Grade(Map<String, Double> mathGrade, Map<String, Double> englishGrade, Map<String, Double> historyGrade, Map<String, Double> scienceGrade) {
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.historyGrade = historyGrade;
        this.scienceGrade = scienceGrade;
    }

    private Map<String, Double> mathGrade;
    private Map<String, Double> englishGrade;
    private Map<String, Double> historyGrade;
    private Map<String, Double> scienceGrade;

    @Override
    public String toString() {
        return "GradesResult{" +
                "mathGrade=" + mathGrade +
                ", englishGrade=" + englishGrade +
                ", historyGrade=" + historyGrade +
                ", scienceGrade=" + scienceGrade +
                '}';
    }
}
