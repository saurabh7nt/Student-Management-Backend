FROM openjdk:17
LABEL maintainer="saurabhtajne07@gmail.com"
WORKDIR /app
ADD target/docker-studentapp-v4.jar /app/docker-studentapp-v4.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar","docker-studentapp-v4.jar" ]