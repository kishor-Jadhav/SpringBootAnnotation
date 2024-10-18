package com.example.SpringAnnotations.Components.Services;

import com.example.SpringAnnotations.Entities.CityMaster;
import com.example.SpringAnnotations.Repository.CityMasterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityMasterService {
    private  CityMasterRepo cityRepository;

    @Autowired
    public  CityMasterService(CityMasterRepo cityRepository){
        this.cityRepository = cityRepository;
    }

    public CityMaster saveCity(CityMaster ct){
        this.cityRepository.save(ct);
        return ct;
    }

    public List<CityMaster> getAllCity(){
        List<CityMaster> ct = this.cityRepository.findAll();
        return ct;
    }
    public List<CityMaster> findByCityName(String cityName){
        List<CityMaster> ct = this.cityRepository.findByCityName(cityName);
        return ct;
    }

    public Optional<CityMaster> findByCityId(Long cityId){
        Optional<CityMaster> ct = this.cityRepository.findById(cityId);
        return ct;
    }
}
