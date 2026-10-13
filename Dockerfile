FROM openjdk:25
COPY "./target/GestionEquipos-1.jar" "app.jar"
EXPOSE 8111
ENTRYPOINT [ "java", "-jar", "app.jar" ]