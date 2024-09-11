package com.weatherAPI.openai.Config;
import com.weatherAPI.openai.dto.Weather;
import com.weatherAPI.openai.service.WeatherService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import java.util.function.Function;

@Configuration
public class Config {

    @Bean
    @Description("Get the weather of the city")
    public Function<Weather.Request, Weather.Response> currentWeather(WeatherService weatherService) {
        return weatherService;
    }
}