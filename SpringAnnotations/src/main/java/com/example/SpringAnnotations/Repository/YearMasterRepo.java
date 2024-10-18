package com.example.SpringAnnotations.Repository;

import com.example.SpringAnnotations.Entities.YearMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface YearMasterRepo extends JpaRepository<YearMaster,Long> {
    List <YearMaster> findByYearName(String yearName);
}
