package com.weatherAPI.openai.service;

import com.weatherAPI.openai.dto.Weather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;
@Service
public class WeatherServiceBuilder {

    @Value("${spring.weather.api.base.uri}")
    private String weatherBaseURI;

    @Value("${spring.weather.api.key}")
    private String weatherAPIKey;


    private WebClient webClient = WebClient.create();

    public Weather.Response getWeather(String city) {
        String uri = UriComponentsBuilder.fromUriString(weatherBaseURI)
                .path("/current.json")
                .queryParam("key", weatherAPIKey)
                .queryParam("q", city)
                .toUriString();

        System.out.println("Weather API Request URI: " + uri); // Log the request URI

        return webClient.get()
                .uri(uri)
                .retrieve()
                .bodyToMono(Weather.Response.class)
                .block(); // Check if this throws any exception
    }
}
