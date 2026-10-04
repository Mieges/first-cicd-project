FROM azul-zulu:25
COPY target/cicd-test-app-0.0.2.jar /app.jar
CMD ["java", "-jar", "/app.jar"]