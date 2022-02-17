FROM adoptopenjdk/openjdk11:latest
WORKDIR /home
COPY /target/demo-docker-0.0.1-SNAPSHOT.jar demo-docker.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo-docker.jar"]

