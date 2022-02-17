FROM maven:3.8.4-openjdk-11-slim AS salario



ENV DIR_APP=/app



#WORKDIR $DIR_APP

RUN mkdir -p $DIR_APP/salary_server

WORKDIR $DIR_APP/salary_server

COPY . .



RUN mvn clean install



FROM openjdk:11



ENV DIR_APP=/app



RUN mkdir -p $DIR_APP/salary_server



WORKDIR $DIR_APP/salary_server

COPY --from=salario $DIR_APP/salary_server/target/*.jar $DIR_APP/salary_server

EXPOSE 8761

CMD ["java", "-jar", "/app/salary_server/salary-Server-0.0.1-SNAPSHOT.jar"]

