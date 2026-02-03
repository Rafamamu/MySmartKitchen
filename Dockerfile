FROM eclipse-temurin:17
WORKDIR /app
COPY target/MySmartKitchen-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8080
LABEL authors="rafaroga46@gmail.com"
ENTRYPOINT ["java", "-jar","app.jar"]