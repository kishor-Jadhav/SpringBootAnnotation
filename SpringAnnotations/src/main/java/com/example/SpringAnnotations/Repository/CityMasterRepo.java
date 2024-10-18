package com.example.SpringAnnotations.Repository;

import com.example.SpringAnnotations.Entities.CityMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CityMasterRepo extends JpaRepository<CityMaster,Long> {
    List<CityMaster> findByCityName(String cityName);
    @Query("select c from CityMaster c")
    List<CityMaster> findAllCityMaster();
}
