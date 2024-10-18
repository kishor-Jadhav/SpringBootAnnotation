package com.example.SpringAnnotations.Entities;

import jakarta.persistence.*;

@Entity
public class CityMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cityId;
    @Column(name = "city_name")
    private String cityName;
    public CityMaster (String cityName){
        this.cityName = cityName;
    }

    public CityMaster() {
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Long getCityId() {
        return cityId;
    }
}
