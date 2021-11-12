public class Solution {


    public int[] twoSum(int[] nums, int target) {

        int[] pos = new int[2];
        int i, j;


        for (i = 0; i < nums.length; i++) {

            for (j = i + 1; j < nums.length; j++) {

                if ((nums[i] + nums[j]) == target) {

                    pos[1] = j;
                    pos[0] = i;
                    return pos;

                }

            }

        }

        return pos;
    }
}



