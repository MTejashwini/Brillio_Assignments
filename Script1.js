/*var a;
let b;
const c=1;
console.log("the value of a is : ", a)
console.log("the value of b is : ", b)
console.log("the value of c is : ", c)
var z='r';
var x='y';
console.log("the value of z is : ", z);
console.log("the value of x is : ", x); 

var tej="i am brown BRObro bread"
var tt=tej.match(/bro/g)
console.log(tt)


var a= '10'
console.log(Number(a))


alert("hi i am teju")
*/
var readline = require('readline');

var rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('What do you think of Node.js? ', (answer) => {
  // TODO: Log the answer in a database
  console.log(`Thank you for your valuable feedback: ${answer}`);dem

  rl.close();
});