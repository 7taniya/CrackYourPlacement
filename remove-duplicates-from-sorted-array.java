class Solution {
    public int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
        return 0;
    }

    int k = 1; // Initialize the unique elements count
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[k - 1]) {
            nums[k] = nums[i]; // Move the unique element to the correct position
            k++; // Increment the unique elements count
        }
    }

    return k;
    }
}
