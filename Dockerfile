FROM openjdk:8
ADD target/countries-api.jar countries-api.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "countries-api.jar"]
