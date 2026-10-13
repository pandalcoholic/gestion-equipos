FROM eclipse-temurin:27-jdk
COPY "./target/GestionEquipos-1.jar" "app.jar"
EXPOSE 8111
ENTRYPOINT [ "java", "-jar", "app.jar" ]