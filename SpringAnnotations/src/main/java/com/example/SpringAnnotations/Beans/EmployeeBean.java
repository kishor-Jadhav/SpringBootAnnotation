package com.example.SpringAnnotations.Beans;

import com.example.SpringAnnotations.BankClass.SBIClass;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeBean {
    String empName;
    String empBankName;
    String empBankAcc;
    double loanIntrest;
    @Autowired
    SBIClass sbiObj;
    public EmployeeBean(String empName,SBIClass sbiObj){
        this.empName = empName;
        this.sbiObj = sbiObj;
        this.empBankAcc = this.sbiObj.getAccountNo();
        this.empBankName = this.sbiObj.getBankName();
        this.loanIntrest = this.sbiObj.getIntrestRate();
    }

    public EmployeeBean(){

    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpBankName(String bankName) {
        sbiObj.setBankName("SBI");
        this.empBankName = sbiObj.getBankName();
    }

    public String getEmpBankName() {
        return empBankName;
    }

    public void setEmpBankAcc(String empBankAcc) {
        this.empBankAcc = empBankAcc;
    }

    public String getEmpBankAcc() {
        return empBankAcc;
    }

    public double getLoanIntrest() {
        return loanIntrest;
    }

    public void setLoanIntrest(double loanIntrest) {
        this.loanIntrest = loanIntrest;
    }

    public SBIClass getSbiObj() {
        return sbiObj;
    }

    public void setSbiObj(SBIClass sbiObj) {
        this.sbiObj = sbiObj;
    }
}
