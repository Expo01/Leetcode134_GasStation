public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        for(int i = 0; i<gas.length; i++){
            sum+= (gas[i] - cost[i]);
        }

    }
}

// not boolean return. need int.
// will need L pointer such that if gas[i]- cost[i] >=0 then proceed with loop and store the index at pointer
// if sum ever dips <0 it means the preceding order did not result in sufficient gas and that starting sequence can
// be discarded. Seems similar to Maximum subarray leetcode



// unitsOfGas
// loop
// use stored start index
// use changing index that say if # of gas stations is 5, that if x = 5 is reached
// then at end of loop set x = 1 for beginning of loop. At end of loop make criteria if
// x = storedStart then exit loop or return true since successful cycle
// start stored will be updated with each loop, so that would be nested for loop with
// increementing storedStart on outer loop and x in inner loop


//  [1, 2, 3, 4, 5]
//  [3, 4, 5, 1, 2]
// [-2,-2,-2, 3, 3]
//  smart way find first + sum?
// a mass sum sufficient? since if sums were 3,-2,-2,3,-2 also works

// [2, 3, 4]
// [3, 4, 3]
// [-1, -1, 1]