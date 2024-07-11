# Use Maven for build stage
FROM maven:3.8.5-openjdk-17 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml file and install dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the source code and build the application
COPY src .
RUN mvn clean package -DskipTests

# Use a slim JDK image for the runtime stage
FROM openjdk:17.0.1-jdk-slim

# Copy the built JAR file from the build stage
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar /demo.jar

# Set the entry point to run the JAR file
ENTRYPOINT ["java", "-jar", "/demo.jar"]
