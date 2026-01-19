FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/IO_lab_11_12-0.0.1-SNAPSHOT.jar IO_lab_11_12-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "IO_lab_11_12-0.0.1-SNAPSHOT.jar"]