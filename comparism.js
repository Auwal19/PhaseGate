const numbers = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];

function sortNumbers(numbers) {
    let change;

    for (let index = 0; index < numbers.length; index++) {
        for (let index1 = 0; index1 < numbers.length; index1++) {
            for (let count = index1 + 1; count < numbers[index].length; count++) {
                if (numbers[index][index1] < numbers[index][count]) {
                    change = numbers[index][index1];
                    numbers[index][index1] = numbers[index][count];
                    numbers[index][count] = change;
                }
            }
        }
    }
}

function displayNumbers(numbers) {
    for (let index = 0; index < numbers.length; index++) {
        for (let count = 0; count < numbers[index].length; count++) {
            process.stdout.write(numbers[index][count] + " ");
        }
        console.log();
    }
}

sortNumbers(numbers);
displayNumbers(numbers);