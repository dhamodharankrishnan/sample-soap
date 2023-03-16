package com.dhamo.soap.service.repository;

import com.dhamo.soap.client.Country;
import com.dhamo.soap.client.Currency;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Country spain = new Country();
        spain.setName("Spain");
        spain.setCapital("Madrid");
        spain.setCurrency(Currency.EUR);
        spain.setPopulation(25000);
        countries.put("Spain", spain);

        Country america = new Country();
        america.setName("USA");
        america.setCapital("WashingtonDC");
        america.setCurrency(Currency.USD);
        america.setPopulation(68768768);

        countries.put("USA", america);

        Country britian = new Country();
        britian.setName("UK");
        britian.setCapital("London");
        britian.setCurrency(Currency.GBP);
        britian.setPopulation(2789999);

        countries.put("UK", britian);
    }

    public Country findCountry(String name) {
        return countries.get(name);
    }
}
