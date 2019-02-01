package com.mentoring.aida.domain;

public class City {
    private static final int MONTHS_IN_A_YEAR = 12;
    private final int numberOfCitizens;
    private final double taxesPerCitizen;

    public City(int numberOfCitizens, double taxesPerCitizen) {
        this.numberOfCitizens = numberOfCitizens;
        this.taxesPerCitizen = taxesPerCitizen;
    }

    public boolean isMetropolis() {
        return getNumberOfCitizens() > 200000 && isMetropolisByAverageIncomeAYear();
    }

    boolean isMetropolisByAverageIncomeAYear() {
        return taxesPerCitizen * numberOfCitizens * MONTHS_IN_A_YEAR >= 720000000.0;
    }

    int getNumberOfCitizens() {
        return numberOfCitizens;
    }
}
