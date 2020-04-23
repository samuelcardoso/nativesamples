# TO RUN
Ref: https://quarkus.io/guides/amazon-lambda
1) Install GRAALVM 19.3.1
2) Install SAM
3) mvn clean install -Dnative
4) sam local invoke --template sam.native.yaml --event payload.json