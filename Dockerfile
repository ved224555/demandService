FROM openjdk:17
LABEL maintainer="Ved Prakash"
ADD target/Demand-0.0.1-SNAPSHOT.jar demand-service.jar
ENTRYPOINT ["java", "-jar", "demand-service.jar"]