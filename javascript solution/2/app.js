function intersection(a1, a2)
{
	var set = new Set(a2);
	return a1.filter(item => set.has(item));
};

var array1 = ["C", "Java", "Python", "HTML", "CSS", "JS"]
var array2 = ["C", "Java", "CSHarp", "HTML", "CSS"]

var elements = intersection(array1, array2);
console.log(elements);

/*
Output

[ 'C', 'Java', 'HTML', 'CSS' ]

*/