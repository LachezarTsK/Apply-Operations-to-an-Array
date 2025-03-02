
function applyOperations(input: number[]): number[] {
    applyMathOperations(input);
    moveZeroValuesToEndWhilePreservingOrderOfNonzeroValues(input);
    return input;
};

function applyMathOperations(input: number[]): void {
    for (let i = 0; i < input.length - 1; ++i) {
        if (input[i] === 0) {
            continue;
        }
        if (input[i] === input[i + 1]) {
            input[i] *= 2;
            input[i + 1] = 0;
        }
    }
}

function moveZeroValuesToEndWhilePreservingOrderOfNonzeroValues(input: number[]): void {
    let index = 0;
    for (let value of input) {
        if (value !== 0) {
            input[index] = value;
            ++index;
        }
    }
    while (index < input.length) {
        input[index] = 0;
        ++index;
    }
}
