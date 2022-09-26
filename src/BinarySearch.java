public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(search(nums, 2));
    }

    public static int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);


    }

    public static int binarySearch(int[] nums, int low, int high, int target) {
        if (low >= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                return binarySearch(nums, 0, mid - 1, target);
            } else {
                return binarySearch(nums, mid + 1, high, target);
            }
        }
        return -1;


    }
}
