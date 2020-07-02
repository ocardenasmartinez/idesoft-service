FROM openjdk:8-jdk-alpine
ADD target/idesoft-service-0.0.1.jar idesoft-service-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "idesoft-service-0.0.1.jar"]