FROM java:8-jre
MAINTAINER Zameer Ahmed Shaik
RUN mkdir -p /apps/microservices/docker/images
ADD ./build/libs/api-gateway-0.0.1-SNAPSHOT.jar /apps/microservices/docker/images
CMD ["java", "-jar", "/apps/microservices/docker/images/api-gateway-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080