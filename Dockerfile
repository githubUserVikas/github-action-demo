FROM openjdk:1.8
EXPOSE 8080
ADD /target/springboot-github-image.jar springboot-github-image.jar
ENTRYPOINT ["java","-jar","springboot-github-image.jar"]