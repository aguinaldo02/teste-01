FROM maven:3.8.4-openjdk-11-slim AS REAJUSTE
RUN mkdir -p /readjustment
WORKDIR /readjustment
COPY . /readjustment

RUN mvn clean install

FROM openjdk:11
RUN mkdir -p /readjustment
WORKDIR /readjustment 
COPY --from=reajuste /target/readjustment.jar 
EXPOSE 8761
CMD ["java", "-jar", "/readjustment"]