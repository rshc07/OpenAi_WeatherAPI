# Weather API Application

This project is a Spring Boot application that provides weather information using OpenAI's chat services. The application retrieves current weather data for a specified city through a RESTful API.

## Overview

The application consists of several components:

- **Config**: Configures the weather service bean.
- **OpenAiController**: Handles HTTP requests and interacts with the OpenAI service to fetch weather information.
- **WeatherService**: Implements the function to get weather details based on city input.
- **WeatherServiceBuilder**: Responsible for making external API calls to fetch weather data.
- **Weather DTO**: Contains data transfer objects for weather requests and responses.

## Technologies Used

- **Spring Boot**: Framework for building the application.
- **Spring AI**: The integration of Spring AI into everyday applications is transforming user experiences, making them more personalized and engaging
- **OpenAI**: For leveraging chat services to fetch weather information.
- **Java**: Programming language used for development.
- **REST Client**: For making HTTP requests to the weather API.
- **Maven**: Build tools used to manage dependencies and build the project.

## APIs Used

- **OpenAI API**: Utilized for querying weather information through chat-based interactions.
- **Weather API**: External API used to get current weather details for a specific city.
- **Postman API**: Used for testing and interacting with various APIs. The GET method in Postman is used to retrieve data from a specified endpoint. For example, you can send a GET request to fetch user details from a server by specifying the endpoint URL and clicking   ‘Send’. The response will display the requested data

## Prerequisites

- Java 8 or higher
- Maven
- Git (optional)

## Project Setup

1. **Clone the repository**:
    ```sh
    git clone https://github.com/yourusername/weather-api-application.git
    ```

2. **Install dependencies**:
    ```sh
    mvn clean install
    ```
    
3. **Configure Application Properties**:
    ```sh
   # Weather API configuration
   spring.weather.api.base.uri=https://api.weatherapi.com/v1
   spring.weather.api.key=your_api_key
   # OpenAI API configuration
   openai.api.key=your_openai_api_key
   ```
    
## API Endpoints

- **POST /ai/query:**: Query weather information.
- **Request Parameter**: query (string): The city for which you want to get the weather details.
- **Response**:
    - 200 OK: Returns a JSON object with the weather information.
    - 400 Bad Request: If the query parameter is missing or invalid.
    - 500 Internal Server Error: If there is an issue with retrieving weather details.
- **Example Request**:
     ```sh
    curl -X POST "http://localhost:8080/ai/query" -d "query=London"
    ```
