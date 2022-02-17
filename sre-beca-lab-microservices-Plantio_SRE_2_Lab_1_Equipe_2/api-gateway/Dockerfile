FROM maven:3.8.4-openjdk-11-slim AS portao



ENV DIR_APP3=/app



#WORKDIR $DIR_APP3

RUN mkdir -p $DIR_APP3/


WORKDIR $DIR_APP2/equipe3

COPY . .



RUN mvn clean install



FROM openjdk:11



ENV DIR_APP3=/app



RUN mkdir -p $DIR_APP3/api-gateway



WORKDIR $DIR_APP3/api-gateway

COPY --from=portao $DIR_APP3/api-gateway/target/*.jar $DIR_APP3/api-gateway

#EXPOSE 8200

CMD ["java", "-jar", "/app/api-gateway/api-gateway-0.0.1-SNAPSHOT.jar"]