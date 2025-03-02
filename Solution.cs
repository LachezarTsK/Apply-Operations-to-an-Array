
using System;

public class Solution
{
    public int[] ApplyOperations(int[] input)
    {
        ApplyMathOperations(input);
        MoveZeroValuesToEndWhilePreservingOrderOfNonzeroValues(input);
        return input;
    }

    private void ApplyMathOperations(int[] input)
    {
        for (int i = 0; i < input.Length - 1; ++i)
        {
            if (input[i] == 0)
            {
                continue;
            }
            if (input[i] == input[i + 1])
            {
                input[i] *= 2;
                input[i + 1] = 0;
            }
        }
    }

    private void MoveZeroValuesToEndWhilePreservingOrderOfNonzeroValues(int[] input)
    {
      int index = 0;
        foreach (int value in input) 
        {
            if (value != 0) 
            {
                input[index] = value;
                ++index;
            }
        }
        while (index < input.Length)    
        {
            input[index] = 0;
            ++index;
        }
    }
}
