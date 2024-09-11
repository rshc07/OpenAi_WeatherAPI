# Weather API Application

This project is a Spring Boot application that provides weather information using OpenAI's chat services. The application retrieves current weather data for a specified city through a RESTful API.

## Overview

The application consists of several components:

- **Config**: Configures the weather service bean.
- **OpenAiController**: Handles HTTP requests and interacts with the OpenAI service to fetch weather information.
- **WeatherService**: Implements the function to get weather details based on city input.
- **WeatherServiceBuilder**: Responsible for making external API calls to fetch weather data.
- **Weather DTO**: Contains data transfer objects for weather requests and responses.
