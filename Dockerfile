FROM openjdk:17
ADD target/springbootmysqldocker.jar springbootmysqldocker.jar
ENTRYPOINT ["java", "-jar", "/springbootmysqldocker.jar"]
