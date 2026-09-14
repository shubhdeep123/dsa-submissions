class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int[] nums = new int[n];
        for (int i=0; i<n; i++) {
            nums[i] = i+1;
        }
        combineHelper(ans,0,k,list,nums);
        return ans;
    }

    public void combineHelper(List<List<Integer>> ans, int index, int k, List<Integer> current, int[] nums) {
        if (k==0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        if (index == nums.length) {
            return;
        }

        current.add(nums[index]);
        combineHelper(ans,index+1,k-1,current,nums);

        current.remove(current.size()-1);
        combineHelper(ans,index+1,k,current,nums);
    }
}

