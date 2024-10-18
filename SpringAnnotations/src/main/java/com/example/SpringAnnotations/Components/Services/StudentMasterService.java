package com.example.SpringAnnotations.Components.Services;

import com.example.SpringAnnotations.Entities.CityMaster;
import com.example.SpringAnnotations.Entities.StudentMaster;
import com.example.SpringAnnotations.MyConfig.ResourceNotFoundException;
import com.example.SpringAnnotations.Repository.StudentMasterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentMasterService {
    private StudentMasterRepo stRepo;
    private  CityMasterService cityService;
    @Autowired
    public  StudentMasterService(StudentMasterRepo stRepo, CityMasterService cityService){
        this.stRepo = stRepo;
        this.cityService = cityService;
    }

    public StudentMaster saveStudent(StudentMaster st){
        CityMaster city = st.getCity();

        if (city != null && city.getCityId() != null) {
            CityMaster existingCity  = cityService.findByCityId(city.getCityId())
                    .orElseThrow(() -> new ResourceNotFoundException("City not found"));

            st.setCity(existingCity);
            return stRepo.save(st);
        } else {
            st.setCity(null);
            return stRepo.save(st);
        }

    }
    public List<StudentMaster> getAllStudent(){
        return stRepo.findAll();
    }

}
