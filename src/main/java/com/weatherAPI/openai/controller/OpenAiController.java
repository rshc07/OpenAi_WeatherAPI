package com.weatherAPI.openai.controller;

import com.weatherAPI.openai.service.OpenAiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;
@Controller
@RequestMapping("/ai")
public class OpenAiController {
    @Autowired
    private OpenAiService aiService;

    @PostMapping("/query")
    public Map<String, String> getWeatherDetails(@RequestParam String query) {
        return Optional.ofNullable(aiService.getWeatherInfo(query))
                .map(response -> response.getResult().getOutput().getContent())
                .map(content -> Map.of("response", content))
                .orElse(Map.of("error", "Failed to retrieve weather details"));
    }
}
