FROM azul-zulu:25
LABEL org.opencontainers.image.source="https://github.com/Mieges/first-cicd-project"
COPY target/*.jar /app.jar
CMD ["java", "-jar", "/app.jar"]