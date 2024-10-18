package com.example.SpringAnnotations.Entities;

import jakarta.persistence.*;

@Entity
public class StudentMarks {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  Long studMarksId;

    @ManyToOne
    @JoinColumn(name ="student_id")
    StudentMaster student;

    @ManyToOne
    @JoinColumn(name ="sub_id")
    SubjectMaster subject;

    @ManyToOne
    @JoinColumn(name ="year_id")
    YearMaster year;

    private Integer marks;

    public  StudentMarks(StudentMaster student,SubjectMaster subject,YearMaster year,Integer marks){
        this.student =student;
        this.subject = subject;
        this.year =year;
        this.marks =marks;
    }

    public void setStudent(StudentMaster student) {
        this.student = student;
    }

    public StudentMaster getStudent() {
        return student;
    }

    public void setSubject(SubjectMaster subject) {
        this.subject = subject;
    }

    public SubjectMaster getSubject() {
        return subject;
    }

    public void setYear(YearMaster year) {
        this.year = year;
    }

    public YearMaster getYear() {
        return year;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Integer getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "studMarksId=" + studMarksId +
                ", student=" + student +
                ", subject=" + subject +
                ", year=" + year +
                ", marks=" + marks +
                '}';
    }
}
