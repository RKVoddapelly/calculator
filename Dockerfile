FROM openjdk:8u191-jdk-alpine3.8

COPY target/calculator-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]