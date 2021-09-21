## Build and run application
`./gradlew build && java -jar build/libs/java-spring-basic-0.0.1-SNAPSHOT.jar`

## Build docker image and run application

```
docker build --build-arg JAR_FILE=build/libs/\*.jar -t java-spring-boot-docker .
docker run -p 8080:8080 java-spring-boot-docker
```