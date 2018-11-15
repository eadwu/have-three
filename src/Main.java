public class Main {
    public boolean haveThree(int[] nums) {
        int n = 0;

        for (int i = 0; i < nums.length; i++)
            n = i > 0 ? nums[i - 1] == 3 ? n : n + 1 : nums[i] == 3 ? n + 1 : n;
        return n == 3;
    }

    public static void main(String[] args) {
        Main Runner = new Main();

        int[][] testNums = {
                {3, 1, 3, 1, 3},
                {3, 1, 3, 3},
                {3, 4, 3, 3, 4}
        };

        for (int i = 0; i < testNums.length; i++) {
            System.out.println("Trial " + i + ": " + Runner.haveThree(testNums[i]));
        }
    }
}