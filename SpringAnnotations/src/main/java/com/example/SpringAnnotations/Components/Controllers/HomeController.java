package com.example.SpringAnnotations.Components.Controllers;

import com.example.SpringAnnotations.BankClass.SBIClass;
import com.example.SpringAnnotations.Beans.EmployeeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    EmployeeBean empBean;

    @GetMapping("/home")
    @ResponseBody
    public  String home(){
        System.out.println("This is home");
        return "this is home";
    }

    @GetMapping("/emp")
    @ResponseBody
    public  EmployeeBean emp(){
        SBIClass sb = new SBIClass("Yes");
        empBean.setEmpBankName(sb.getBankName());
        empBean.setSbiObj(sb);
        System.out.println("This is emp");
        return empBean;
    }
}
