FROM openjdk:8-jdk-alpine
EXPOSE 8081
COPY target/dockerdemo-0.0.1-SNAPSHOT.jar application.jar
ENTRYPOINT ["java","-jar","application.jar"]