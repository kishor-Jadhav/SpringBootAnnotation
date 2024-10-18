package com.example.SpringAnnotations.BankClass;

public class SBIClass implements BankInterface{
String bankName;
public  SBIClass(String bankName){
    this.bankName=bankName;
}
    @Override
    public double getIntrestRate() {
        return 6.5;
    }

    @Override
    public String getAccountNo() {
        return "SBI -1234";
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
