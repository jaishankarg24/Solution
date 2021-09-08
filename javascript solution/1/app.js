let str = "Hello word Hello";
const array = str.split(" ");
const newObj = {};

for (let word of array) {
  if (!newObj[word]) {
    newObj[word] = 1;
  } else {
    newObj[word]++;
  }
}

console.log(newObj);


/* output
{ Hello: 2, word: 1 }
*/