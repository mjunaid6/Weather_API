package com.cfs.Weather_API.dto;

public class WeatherResponse {

    private String condition;

    private String temparature;

    private String city;

    public WeatherResponse(String condition, String temparature, String city) {
        this.condition = condition;
        this.temparature = temparature;
        this.city = city;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getTemparature() {
        return temparature;
    }

    public void setTemparature(String temparature) {
        this.temparature = temparature;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
