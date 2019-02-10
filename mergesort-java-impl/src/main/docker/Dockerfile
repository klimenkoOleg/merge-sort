FROM openjdk:8u131-jre-alpine

MAINTAINER Oleg Klimenko "oklimenko@gmail.com"

ADD maven/mergesort mergesort.war

EXPOSE 8080

CMD ["java","-Dspring.profiles.active=docker","-Djava.security.egd=file:/dev/./urandom","-jar","mergesort.jar"]
