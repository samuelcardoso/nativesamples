Node:
https://github.com/nodejs/node-gyp

cd dotnet/node
node-gyp configure
node-gyp build
node node/index.js

Java:
https://blog.caelum.com.br/escrevendo-metodos-nativos-em-java-com-jni-e-jna/

cd dotnet/
gcc -o libsomadorJNA.so -shared somadorJNA.c
<rodar pelo eclise>
