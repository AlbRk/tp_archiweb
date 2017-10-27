FROM lwieske/java-8
VOLUME /tmp
EXPOSE 8080
ADD tp_archiweb.war app.war
RUN sh -c "echo 'tp_archiweb-1.0-SNAPSHOT.war'"
RUN sh -c "touch /app.war"
ENTRYPOINT ["sh", "-c", "java -jar /app.war"]