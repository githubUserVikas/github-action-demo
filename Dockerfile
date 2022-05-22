FROM openjdk:11
EXPOSE 8080
ADD /target/springboot-github-image.jar springboot-github-image.jar
ENTRYPOINT ["java","-jar","springboot-github-image.jar"]