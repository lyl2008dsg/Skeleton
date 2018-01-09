FROM openjdk:8-jre-alpine
ADD skeleton-service-1.0.0.jar /app.jar
EXPOSE 3333
ENTRYPOINT ["java", "-jar", "/app.jar"]
