package com.example.SpringAnnotations.Entities;

import jakarta.persistence.*;

@Entity
public class StudentMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studId;
    private String studentName;
    @ManyToOne
    @JoinColumn(name = "city_id" ,nullable = true)
    CityMaster city;

    public StudentMaster(String studentName,CityMaster city){
        this.studentName =studentName;
        this.city = city;
    }
    public StudentMaster(){

    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setCity(CityMaster city) {
        this.city = city;
    }

    public CityMaster getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "StudentMaster{" +
                "studId=" + studId +
                ", studentName='" + studentName + '\'' +
                ", city=" + city +
                '}';
    }
}
