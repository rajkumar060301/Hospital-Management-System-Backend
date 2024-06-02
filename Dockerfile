FROM maven:3.2.5-openjdk-22 AS build
COPY . .

RUN mvn clean package -DskipTests
FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/HospitalManagement-0.0.1-SNAPSHOT.jar HospitalManagement.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","HospitalManagement.jar"]