package com.company;

import java.util.Date;

/**
 * Created by mash4 on 3/19/2017.
 */
public class WaterHeater extends ServiceCall {
    private String serviceRequiested;
    private int waterHeat_Age;
    protected  static  double extraChargedFee = 20.0;
    public WaterHeater(String serviceAddress, String problemDescription,
                        String req_Service, int age, Date date) {
        super(serviceAddress, problemDescription, date);
        this.serviceRequiested = req_Service;
        this.waterHeat_Age = age;
    }
//
    public String getServiceRequiested() {
        return serviceRequiested;
    }

    public void setServiceRequiested(String serviceRequiested) {
        this.serviceRequiested = serviceRequiested;
    }

    public int getWaterHeat_Age() {
        return waterHeat_Age;
    }

    public void setWaterHeat_Age(int waterHeat_Age) {
        this.waterHeat_Age = waterHeat_Age;
    }


    @Override
    public String toString() {

        //These statements use the Java ternary operator
        //This says "if resolvedDate == null, then set resolvedDate to "Unresolved". Otherwise, set resolvedDate to resolvedDate.toString()
        //Same logic as an if-else statment, but more consise if the condition is simple and the if statment's task is
        //to set the value of a variable based on a condition being true or false.
        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee);


        return "Central AC Unit Service Call " + "\n" +
                "Service Address= " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Fee = " + feeString  +" + "+ extraChargedFee;

    }



}
