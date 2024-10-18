package com.example.SpringAnnotations.BankClass;

public class YESBankClass  implements  BankInterface{
    String bankName;
    public  YESBankClass(String bankName){
        this.bankName=bankName;
    }
    @Override
    public double getIntrestRate() {
        return 8.2;
    }

    @Override
    public String getAccountNo() {
        return "Yes Bank -1234";
    }
}
