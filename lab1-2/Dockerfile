FROM openjdk:23

ARG APP_JAR=build/libs/*.jar

COPY ${APP_JAR} app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar", "10"]
