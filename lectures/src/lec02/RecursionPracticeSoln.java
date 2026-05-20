package lec02;

public class RecursionPracticeSoln {
    public static void main(String[] args) {
        System.out.println(upgrade("lol110lol"));
        System.out.println(pairCount("zomg!1!1!"));
        System.out.println(sumToTarget(new int[] {8, 9, 5}, 0, 22));
    }

    public static String upgrade(String str) {
        /* Base case: the string is less than 3 characters long and
        cannot possibly contain "110" */
        if(str.length() < 3)
            // Return the string unchanged
            return str;

        // Recursive case 1: the string starts with "110"
        if(str.startsWith("110")) {
            /* Replace the "110" with "210" and upgrade the rest of
            the string */
            return "210" + upgrade(str.substring(3));
        }

        // Recursive case 2: the string does not start with "110"
        /* Keep the first character unchanged and upgrade the rest
        of the string */
        return str.charAt(0) + upgrade(str.substring(1));
    }

    public static int pairCount(String str) {
        /* Base case: the string is less than 3 characters long and
        cannot possibly contain a separated pair */
        if(str.length() < 3) {
            // Return a count of 0
            return 0;
        }

        // Recursive case 1: the string starts with a separated pair
        if(str.charAt(0) == str.charAt(2)) {
            /* Get the number of remaining separated pairs in the string
            starting from the next index. Add 1 to account for this
            separated pair */
            return 1 + pairCount(str.substring(1));
        }

        /* Recursive case 2: the string does not start with a separated
        pair */
        /* Get the number of remaining separated pairs in the string
        starting from the next index */
        return pairCount(str.substring(1));
    }

    public static boolean sumToTarget(int[] nums, int start, int target) {
        // Base case: the starting index is past the end of the array
        if (start >= nums.length) {
            /* Return true only if the target is 0 since there are no
            numbers to add */
            return target == 0;
        }

        // Recursive case 1
        /* Check whether we can sum to the target using the number at
        the starting index. Do this by checking if the rest of the array
        can sum to the target minus the current number */
        if(sumToTarget(nums, start + 1, target - nums[start])) {
            return true;
        }

        // Recursive case 2
        /* Check whether we can sum to the target without using the
        number at the starting index. Do this by checking if the rest of
        the array can sum to the target */
        return sumToTarget(nums, start + 1, target);
    }
}