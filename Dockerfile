FROM maven:3.6.3-jdk-8-slim as build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn -f ./pom.xml clean package -DskipTests
FROM openjdk:8-jdk-alpine
EXPOSE 8081
COPY ./target/dockerdemo-0.0.1-SNAPSHOT.jar application.jar
ENTRYPOINT ["java","-jar","application.jar"]