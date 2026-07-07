class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //[-4, -1, -1, 0, 1, 2]
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0; i < nums.length-2; ++i) {
            int j = i+1, k = nums.length-1; 
            while (j < k) {
                int sum = nums[j] + nums[k]; 
                if (sum == -nums[i]) {
                    //List<Integer> row = Arrays.asList();
                    if (res.contains(Arrays.asList(nums[i], nums[j], nums[k]))) {
                        j++;
                        k--;
                        continue;
                    }
                    else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        j++;
                        k--;
                        continue;
                    }
                }
                else if (sum < -nums[i]) {
                    j++; 
                }
                else {
                    k--; 
                }
            } 
        }

        return res;
    }
}
