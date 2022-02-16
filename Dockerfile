FROM openjdk:8-jdk-alpine
WORKDIR /home
COPY /target/demo-docker-0.0.1-SNAPSHOT.jar demo-docker.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo-docker.jar"]

