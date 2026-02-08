# Use Java 21
FROM eclipse-temurin:21-jdk

# Set working directory
WORKDIR /app

# Copy Maven wrapper and pom
COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn

# Download dependencies
RUN ./mvnw dependency:go-offline

# Copy source code
COPY src src

# Build the application
RUN ./mvnw clean package -DskipTests

# Expose port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "target/moviecatalog-0.0.1-SNAPSHOT.jar"]
