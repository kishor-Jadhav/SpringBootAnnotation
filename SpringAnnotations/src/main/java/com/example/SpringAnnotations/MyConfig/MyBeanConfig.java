package com.example.SpringAnnotations.MyConfig;

import com.example.SpringAnnotations.BankClass.SBIClass;
import com.example.SpringAnnotations.BankClass.YESBankClass;
import com.example.SpringAnnotations.Beans.EmployeeBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanConfig {
    @Bean
   public EmployeeBean getEMPBean(){
        return new EmployeeBean();
    }

    @Bean
    public SBIClass getSBIBean(){
        return new SBIClass("SBI");
    }

    @Bean
    public YESBankClass getYesBankBean(){
        return new YESBankClass("Yes Bank");
    }
}
