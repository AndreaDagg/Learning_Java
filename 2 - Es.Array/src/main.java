
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
