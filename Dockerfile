FROM java:8
EXPOSE 9090
ADD /target/test-rmm-0.0.1-SNAPSHOT.war test-rmm-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java", "-jar", "test-rmm-0.0.1-SNAPSHOT.war"]