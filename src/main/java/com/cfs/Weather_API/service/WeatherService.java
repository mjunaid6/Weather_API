package com.cfs.Weather_API.service;

import com.cfs.Weather_API.dto.RootClass;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    public String test(){
        return "good ";
    }

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.url}")
    private String apiurl;

    private final RestTemplate template= new RestTemplate(); // use to consume api within the beckend from one beckend to another

    public RootClass getData(String city){
        String url= apiurl + "?key=" + apiKey + "&q=" + city;
        System.out.println("url");
        RootClass response= template.getForObject(url,RootClass.class);
        return response;
    }

}
