class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        Set<List<Integer>> list = new HashSet<>();
        int x, y, z;
        x = 0;
        y = x + 1;
        z = nums.length - 1;

        while (x < nums.length - 2) {
            y = x + 1;
            z = nums.length-1;
            
            while (y < z) {
                int sum = nums[y] + nums[z];
                if (nums[x] + sum == 0) {
                    list.add(Arrays.asList(nums[x], nums[y], nums[z]));
                    y++;
                    z--;
                } else if (nums[x] + sum < 0)
                    y++;
                else
                    z--;
            }
            x++;
        }

        return new ArrayList<>(list);
    }
}