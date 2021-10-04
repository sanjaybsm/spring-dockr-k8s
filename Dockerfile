FROM openjdk:13
EXPOSE 9000
ARG JAR_FILE= ./target/spring-dockr-k8s-0.0.1-SNAPSHOT.jar
ADD ./target/spring-dockr-k8s-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]