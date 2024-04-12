FROM openjdk:17-oracle
#Un contoneur est une machine virtuel
VOLUME /tmp
COPY target/*.jar app.jar
#Au moment de demarage exceuter ces commandes la :
ENTRYPOINT ["java","-jar", "/app.jar"]