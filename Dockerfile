FROM maven:3.8.4-jdk-11
WORKDIR /todo
COPY . .
RUN mvn install
CMD mvn spring-boot:run -X