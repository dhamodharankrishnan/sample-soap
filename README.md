## Recreation
Thanks to Baeldung for the guidance.


## Tutorial
https://www.baeldung.com/spring-boot-soap-web-service

# Compile
mvn compile

# Run
mvn spring-boot:run

## Modifications from tutorial
Used higher version of xjc.

## Test

## Spain
curl --header "content-type: text/xml" -d @request.xml http://localhost:8080/ws | xmllint --format -

## UK
curl --header "content-type: text/xml" -d @request_uk.xml http://localhost:8080/ws | xmllint --format -

## USA
curl --header "content-type: text/xml" -d @request_usa.xml http://localhost:8080/ws | xmllint --format -
