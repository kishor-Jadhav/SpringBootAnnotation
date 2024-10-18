package com.example.SpringAnnotations.Repository;

import com.example.SpringAnnotations.Entities.StudentMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentMasterRepo extends JpaRepository<StudentMaster,Long> {
    @Query("Select s from StudentMaster s")
    List <StudentMaster> getAllStudents();
}
