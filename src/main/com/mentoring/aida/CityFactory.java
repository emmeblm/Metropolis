package com.mentoring.aida;

import com.mentoring.aida.domain.Capital;
import com.mentoring.aida.domain.City;

class CityFactory {

    static City create(boolean isCapital, int numberOfCitizens, double taxesPerCitizen) {
        return isCapital ? new Capital(numberOfCitizens, taxesPerCitizen) : new City(numberOfCitizens, taxesPerCitizen);
    }
}
