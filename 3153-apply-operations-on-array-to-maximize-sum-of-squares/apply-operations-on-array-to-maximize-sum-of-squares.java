class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int n  = nums.size();
       int mod = 1_000_000_007;
        int res=0;
        int count[] = new int[32];

        for(int num : nums){
            for(int b=0; b<32; b++){
                if((num & (1 << b)) != 0){
                    count[b]++; // found 1 at this position
                }
            }

        }

        while((k--)>0){
            int curr = 0;
            for(int b = 0; b<32; b++ ){
                if(count[b] > 0){
                    count[b]--;

                    curr = (curr | ( 1<< b));
                }
            }

            res = (int) ((res + (long) curr * curr) % mod);
        }
        return res;
        
    }
}