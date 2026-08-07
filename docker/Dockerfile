FROM eclipse-temurin:17-jre

WORKDIR /app

COPY build/libs/product-service-0.0.1-SNAPSHOT.jar product-service.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "product-service.jar"]
