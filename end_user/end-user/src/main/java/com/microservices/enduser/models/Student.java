package com.microservices.enduser.models;

public class Student {
    public String getName() {
        return name;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public double getHistoryGrade() {
        return historyGrade;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }

    public void setHistoryGrade(double historyGrade) {
        this.historyGrade = historyGrade;
    }

    public void setScienceGrade(double scienceGrade) {
        this.scienceGrade = scienceGrade;
    }

    private String name;
    private double mathGrade;
    private double englishGrade;
    private double historyGrade;
    private double scienceGrade;

    public Student(String name, double mathGrade, double englishGrade, double historyGrade, double scienceGrade) {
        this.name = name;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.historyGrade = historyGrade;
        this.scienceGrade = scienceGrade;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mathGrade=" + mathGrade +
                ", englishGrade=" + englishGrade +
                ", historyGrade=" + historyGrade +
                ", scienceGrade=" + scienceGrade +
                '}';
    }
}
