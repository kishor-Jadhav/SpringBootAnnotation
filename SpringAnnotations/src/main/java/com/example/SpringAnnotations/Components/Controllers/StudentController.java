package com.example.SpringAnnotations.Components.Controllers;

import com.example.SpringAnnotations.Components.Services.CityMasterService;
import com.example.SpringAnnotations.Components.Services.StudentMasterService;
import com.example.SpringAnnotations.Entities.CityMaster;
import com.example.SpringAnnotations.Entities.StudentMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private CityMasterService cityService;

    @Autowired
    private StudentMasterService studentSer;
    @GetMapping("/student")
    public StudentMaster getStudents(){
        CityMaster ct = new CityMaster("Pune");
        StudentMaster st = new StudentMaster("Kishor",ct);
        return st;
    }

    @PostMapping("/city")
    public ResponseEntity<?> saveCityMaster(@RequestBody CityMaster ct){
        List<CityMaster> findct = cityService.findByCityName(ct.getCityName());
        if(findct.isEmpty()){
            cityService.saveCity(ct);
            return new ResponseEntity<>(getCityMaster(), HttpStatus.CREATED);

        } else {
            String errorMessage = "City name '" + ct.getCityName() + "' is already in use.";
            return new ResponseEntity<>(errorMessage, HttpStatus.CONFLICT);
        }

    }

 /* Post Object -{
    "studentName": "Ram",
    "city": {
        "cityId": 1
    }
}*/
    @PostMapping("/student")
    public ResponseEntity<?> saveStudentMaster(@RequestBody StudentMaster st){
        studentSer.saveStudent(st);
        return new ResponseEntity<>(getStudentMaster(), HttpStatus.CREATED);

    }

    @GetMapping("/getCity")
    public List<CityMaster> getCityMaster(){
        List<CityMaster> ct = cityService.getAllCity();
        return ct;
    }

    @GetMapping("/getStudent")
    public List<StudentMaster> getStudentMaster(){
        List<StudentMaster> st = studentSer.getAllStudent();
        return st;
    }
}
