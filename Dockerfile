FROM java:openjdk-8-jre
MAINTAINER Andrii Rubtsov<Andrii.Rubtsov@gmail.com>

COPY target/boot-web.jar /opt/boot-web.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/opt/boot-web.jar"]