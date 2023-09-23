public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}

// [3,-2,-2,3,-2, -5, 10]
// MY SOLUTION, SUCK MY LEFT NUT, LEETCODE
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curSum = 0;
        int preSum = 0;
        int L = 0;
        int curr = 0;

        while (curr < gas.length) {
            curSum += gas[curr] - cost[curr];
            if (curSum < 0) {
                preSum += curSum;
                curSum = 0;
                L = curr + 1;
            }
            curr++;
        }
        if ((preSum + curSum) < 0) {
            return -1;
        } else {
            return L;

        }
    }
}

// maybe need currSum vs priorSum?
// take 3,-2,-2,3,-2
// index 0 to 2 = -1 sum. store to priorSum and say starting index 3 to 4 cur sum is 1
// prior sum + cur sum >= 0
// suppose a section is - then + then - then +
// [3,-2,-2,3,-2, -5, 10]. total sum is 5. sections of -1, -4, 6. every time seection is neg add to prriorSUm

//        for(int i = 0; i<gas.length; i++){
//            sum+= (gas[i] - cost[i]);
//        }


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