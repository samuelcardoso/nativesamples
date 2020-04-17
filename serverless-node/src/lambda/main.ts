const app = require('../dotnet/node/build/Release/program')
console.log(app.hello());

export async function run(event, context) {
  context.callbackWaitsForEmptyEventLoop = false;
}
