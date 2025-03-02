
class Solution {

    fun applyOperations(input: IntArray): IntArray {
        applyMathOperations(input)
        moveZeroValuesToEndWhilePreservingOrderOfNonzeroValues(input)
        return input
    }

    private fun applyMathOperations(input: IntArray) {
        for (i in 0..<input.size - 1) {
            if (input[i] == 0) {
                continue
            }
            if (input[i] == input[i + 1]) {
                input[i] *= 2
                input[i + 1] = 0
            }
        }
    }

    private fun moveZeroValuesToEndWhilePreservingOrderOfNonzeroValues(input: IntArray) {
        var index = 0
        for (value in input) {
            if (value != 0) {
                input[index] = value
                ++index
            }
        }
        while (index < input.size) {
            input[index] = 0
            ++index
        }
    }
}
