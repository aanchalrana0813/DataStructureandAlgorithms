
class SlidingWindowMaximum {
	public static int findMaxSlidingWindow(int[] nums, int w) {
		// your code will replace the placeholder return statement below
		int maxValue = Integer.MIN_VALUE;
		int currentMaxvalue = 0;

		for( int i =0; i< nums.length; i++){
			currentMaxvalue += nums[i];
			if(i>= w-1){
				maxValue = Math.max(maxValue ,currentMaxvalue );
				currentMaxvalue -= nums[i-(w-1)];

			}

		}
		return maxValue;
	}

    public static void main(String[] args){
        int nums[] = {2,5,8,7,5,4};
        findMaxSlidingWindow(nums,3);
    }
}