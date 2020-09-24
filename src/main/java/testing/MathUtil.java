package testing;

public class MathUtil {

        /**
         * Returns the smallest number from an array of numbers.
         * It should return 0 if the array is empty or null.
         */
        public static int findMin(int[] nums) {
            int min = nums[nums.length-1];

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < min) {
                    min = nums[i];
                }
            }

            return min;
        }
}