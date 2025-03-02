
package main

func applyOperations(input []int) []int {
    applyMathOperations(input)
    moveZeroValuesToEndWhilePreservingOrderOfNonzeroValues(input)
    return input
}

func applyMathOperations(input []int) {
    for i := range len(input) - 1 {
        if input[i] == 0 {
            continue
        }
        if input[i] == input[i + 1] {
            input[i] *= 2
            input[i+1] = 0
        }
    }
}

func moveZeroValuesToEndWhilePreservingOrderOfNonzeroValues(input []int) {
    index := 0
    for _,value := range input {
        if (value != 0) {
            input[index] = value
            index++
        }
    }
    for index < len(input) {
        input[index] = 0
        index++
    }
}
