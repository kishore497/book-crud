# Start from a lightweight Java image
FROM openjdk:17-jdk-slim

# Set environment variable
ENV APP_HOME=/app

# Create app directory inside container
WORKDIR $APP_HOME

# Copy jar file into the container
COPY target/*.jar app.jar

# Expose the port your Spring Boot app runs on
EXPOSE 8080

# Command to run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]