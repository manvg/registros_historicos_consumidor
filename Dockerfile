FROM eclipse-temurin:21-jdk  

WORKDIR /app

COPY target/registros_historicos_consumidor-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8084

ENTRYPOINT ["java", "-jar", "app.jar"]
