package com.mentoring.aida;

import com.mentoring.aida.domain.City;

import java.util.Random;

class Main {

    public static void main(String[] args) {
        Random random = new Random();
        boolean isCapital = random.nextBoolean();
        int numberOfCitizens = random.nextInt(1000000);
        double taxesPerCitizen = random.nextDouble() * 500;

        City city = CityFactory.create(isCapital, numberOfCitizens, taxesPerCitizen);

        System.out.println("The city is ".concat(city.isMetropolis() ? "" : "not ").concat("a Metropolis"));
    }
}
