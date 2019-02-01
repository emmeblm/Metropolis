package com.mentoring.aida.domain;

public class Capital extends City {

    public Capital(int numberOfCitizens, double taxesPerCitizen) {
        super(numberOfCitizens, taxesPerCitizen);
    }

    public boolean isMetropolis() {
        return getNumberOfCitizens() > 100000 && isMetropolisByAverageIncomeAYear();
    }
}
