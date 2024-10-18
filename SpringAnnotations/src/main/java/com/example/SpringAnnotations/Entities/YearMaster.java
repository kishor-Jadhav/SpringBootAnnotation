package com.example.SpringAnnotations.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class YearMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long yearId;

    private String yearName;

    public YearMaster(String yearName){
        this.yearName = yearName;
    }

    public void setYearName(String yearName) {
        this.yearName = yearName;
    }

    public String getYearName() {
        return yearName;
    }

    @Override
    public String toString() {
        return "YearMaster{" +
                "yearId=" + yearId +
                ", yearName='" + yearName + '\'' +
                '}';
    }
}
