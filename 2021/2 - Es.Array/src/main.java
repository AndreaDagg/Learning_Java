/**
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 You can return the answer in any order.



 Example 1:

 Input: nums = [2,7,11,15], target = 9
 Output: [0,1]
 Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 Example 2:

 Input: nums = [3,2,4], target = 6
 Output: [1,2]
 Example 3:

 Input: nums = [3,3], target = 6
 Output: [0,1]

 */
public class main {

    public static void main(String[] args) {

        int[] nums = {2, 7,7,3,2};
        int targhet = 9, i = 0;
        int[] sol = new int[2];
        Solution solution = new Solution();


        sol = solution.twoSum(nums, targhet);


        while (i != sol.length) {
            System.out.println(sol[i] + " ");
            i++;
        }


    }


}
