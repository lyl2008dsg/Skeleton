FROM openjdk:8-jre-alpine
ADD *.jar /app.jar
EXPOSE 3333
ENTRYPOINT ["java", "-jar", "/app.jar"]
