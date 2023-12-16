FROM maven:eclipse-temurin-21-alpine AS build
WORKDIR /workspace

COPY pom.xml pom.xml
COPY src src
#RUN --mount=type=cache,target=/root/.m2 ./mvnw -f /workspace/pom.xml clean package -DskipTests
RUN mvn -f pom.xml clean package -DskipTests

FROM eclipse-temurin:21_35-jre-alpine
COPY --from=build /workspace/target/*.jar app.jar
ENV SERVER_PORT=8043
EXPOSE $SERVER_PORT/tcp
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]