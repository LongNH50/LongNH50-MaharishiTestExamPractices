public class SearchInsert {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6},0));
    }
    public static int searchInsert(int[] nums, int target) {
//        if(target < nums[0]) return 0;
//        if(target > nums[nums.length - 1]) return nums.length;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;

    }
}
