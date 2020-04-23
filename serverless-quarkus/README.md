# TO RUN
Ref: https://quarkus.io/guides/amazon-lambda
1) Install GRAALVM 19.3.1
2) Install SAM
3) export JAVA_HOME=/usr/lib/jvm/graalvm
4) export GRAALVM_HOME=/usr/lib/jvm/graalvm
5) mvn clean install -Dnative
6) GRAALVM_HOME/bin/gu install native-image
7) sam local invoke --template sam.native.yaml --event payload.json