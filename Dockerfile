FROM openjdk:17
EXPOSE 8080
ADD target/springboot-docker-jenkin-pipelineapp.jar springboot-docker-jenkin-pipelineapp.jar
ENTRYPOINT ["java","-jar","/springboot-docker-jenkin-pipelineapp.jar"]