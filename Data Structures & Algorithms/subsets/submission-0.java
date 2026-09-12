class Solution {
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {

        subsetsHelper(0,nums,new ArrayList<>());

        return result;
    }

    public void subsetsHelper(int index, int[] nums, List<Integer> current) {
        // base case
        if (nums.length == index) {
            result.add(new ArrayList<>(current));
            return;
        }

        // take it
        current.add(nums[index]);

        subsetsHelper(index+1,nums,current);

        // leave it
        current.remove(current.size()-1);

        subsetsHelper(index+1,nums,current);
        
    }
}
