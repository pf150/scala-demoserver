FROM openjdk:9-jre
EXPOSE 8080
ADD build/libs/demoserver-scala-1.0.jar app.jar
RUN mkdir -p /opt/stats
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
