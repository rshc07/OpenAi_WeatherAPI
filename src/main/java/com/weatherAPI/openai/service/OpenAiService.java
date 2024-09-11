package com.weatherAPI.openai.service;

import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpenAiService {

    @Autowired
    ChatModel chatModel;

    public ChatResponse getWeatherInfo(String query) {
        try {
            UserMessage userMessage = new UserMessage(query);
            return chatModel.call(new Prompt(userMessage,
                    OpenAiChatOptions.builder().withFunction("currentWeather").build()));
        } catch (Exception e) {
            e.printStackTrace();
            // Optionally return a default error response or handle the exception
            return null;
        }
    }
}
