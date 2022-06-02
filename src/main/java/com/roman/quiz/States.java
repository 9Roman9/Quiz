package com.roman.quiz;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "states")
public class States {
    @Id
    private int id;
    private String region;
    private String country;
    private String capital;

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public String getCapital() {
        return capital;
    }
}
