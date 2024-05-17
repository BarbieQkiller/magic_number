FROM maven:3.9.6-eclipse-temurin-22-alpine
COPY . /
RUN mvn -f /pom.xml clean install

#CMD ["/bin/sh"]
ENTRYPOINT ["java", "-jar", "/GeneratorApp/target/GeneratorApp-1.0-SNAPSHOT.jar"]