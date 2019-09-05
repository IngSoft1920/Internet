FROM tomcat:9-jre8-alpine
ARG JAR_FILE
RUN rm -rf /usr/local/tomcat/webapps/ROOT
COPY ${JAR_FILE} /usr/local/tomcat/webapps/ROOT.war