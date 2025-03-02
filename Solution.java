
public class Solution {

    public int[] applyOperations(int[] input) {
        applyMathOperations(input);
        moveZeroValuesToEndWhilePreservingOrderOfNonzeroValues(input);
        return input;
    }

    private void applyMathOperations(int[] input) {
        for (int i = 0; i < input.length - 1; ++i) {
            if (input[i] == 0) {
                continue;
            }
            if (input[i] == input[i + 1]) {
                input[i] *= 2;
                input[i + 1] = 0;
            }
        }
    }

    private void moveZeroValuesToEndWhilePreservingOrderOfNonzeroValues(int[] input) {
        int index = 0;
        for (int value : input) {
            if (value != 0) {
                input[index] = value;
                ++index;
            }
        }
        while (index < input.length) {
            input[index] = 0;
            ++index;
        }
    }
}
