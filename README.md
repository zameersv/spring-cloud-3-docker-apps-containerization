# Spring cloud - Containerize the spring boot apps using Docker.
###
~~~
  1. Added Dockerfile for each application
  2. Added docker-compose.yml file at the root level of the project.
  3. Eureka server URL in each application has been updated from from localhost to serviceId (registry) defined in the docker compose.
~~~
### Read me in progress ...


###Pre-requisites:
~~~
1. Docker
2. Java-8
~~~

###Few Basic Docker Commands:
docker images - lists all the images
docker ps -a (list all the containers)
docker ps - lists all running containers
docker stop $(docker ps -a -q) - stop all the running containers
docker rm $(docker ps -a -q)  - Delete all containers
docker rmi $(docker images -q) - Delete all images
docker-compose build - builds the images.
docker-compose up - Runs the container.

###Changes Made:
~~~
1. Added DockerFile for each application
2. Added Docker Compose file
3. Need to change the  eureka server in each server from localhost to serviceId (registry) defined in the docker compose.
~~~

### Check points.
~~~
1. Check the below URL and make sure Eureka server is up & runing.
2. Also make sure all the 5 applications are registered with Eureka server.
~~~