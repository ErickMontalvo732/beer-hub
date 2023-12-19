# FROM openjdk:17-jdk-slim
# WORKDIR /app
# COPY target/beer-hub-backend-0.0.1-SNAPSHOT.jar beer-hub-backend-0.0.1-SNAPSHOT.jar
# EXPOSE 8080
# CMD ["java", "-jar", "beer-hub-backend-0.0.1-SNAPSHOT.jar"]


FROM maven:3.8.4-openjdk-17-slim AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean install -DskipTests


FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/beer-hub-backend-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "beer-hub-backend-0.0.1-SNAPSHOT.jar"]
