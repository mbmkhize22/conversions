# conversions
Convert Metric to imperial and vice versa. The API must cater for at least 5 conversions

    Technical test instructions:    

    1. Create a Spring Boot application using rest API’s to do a conversions.

    2. Convert Metric to imperial and vice versa. The API must cater for at least 5 conversions (include temperature conversion please).

    3. Ensure that you have proper Unit and Integration testing that accompany the project.

    4. Postman/Jmeter project with your RestAPI's.

    5. Upload your project into your own GIT repository and share the project with us.

    6. The project must be able to run in its own Docker environment

    7. Build system must use Maven.
# Docker Setup
    docker build -t spring-boot-docker.jar .
    docker run -p 8080:8080 spring-boot-docker.jar
    
# Swagger
    http://localhost:8080/swagger-ui.html
    
    #Length
    # http://localhost:8080/api/v1/converter/convert/{unitIn}/{unitOut}/{value}/{type}
    http://localhost:8080/api/v1/converter/convert/m/km/1000/length // -> 1.0 KM
    http://localhost:8080/api/v1/converter/convert/km/m/1/length // -> 1000.0 M
    
    #Temparature
    # http://localhost:8080/api/v1/converter/convert/{unitIn}/{unitOut}/{value}/{type}
    http://localhost:8080/api/v1/converter/convert/Celsius/Fahrenheit/1/length
    http://localhost:8080/api/v1/converter/convert/Fahrenheit/Celsius/1/length