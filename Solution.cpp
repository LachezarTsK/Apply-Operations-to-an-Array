
#include <span>
#include <vector>
using namespace std;


class Solution {

public:
    vector<int> applyOperations(vector<int>& input) const {
        applyMathOperations(input);
        moveZeroValuesToEndWhilePreservingOrderOfNonzeroValues(input);
        return input;
    }

private:
    void applyMathOperations(span<int> input) const {
        for (int i = 0; i < input.size() - 1; ++i) {
            if (input[i] == 0) {
                continue;
            }
            if (input[i] == input[i + 1]) {
                input[i] *= 2;
                input[i + 1] = 0;
            }
        }
    }

    void moveZeroValuesToEndWhilePreservingOrderOfNonzeroValues(span<int> input) const {
        int index = 0;
        for (auto& value : input) {
            if (value != 0) {
                input[index] = value;
                ++index;
            }
        }
        while (index < input.size()) {
            input[index] = 0;
            ++index;
        }
    }
};
