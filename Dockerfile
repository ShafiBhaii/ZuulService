FROM openjdk:8-jre-alpine
COPY ./target/FlightZuul-0.0.1-SNAPSHOT.jar /usr/src/zuulservice/
WORKDIR /usr/src/zuulservice/
EXPOSE 9010
CMD ["java","-jar","FlightZuul-0.0.1-SNAPSHOT.jar"]