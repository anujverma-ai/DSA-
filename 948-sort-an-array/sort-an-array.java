class Solution {
    void merge(int nums[],int low,int mid ,int high , int res[]){

        int i = low;
        int j = mid+1;
        int k=low;
        while(i<=mid && j<=high){
            if(nums[i]<nums[j]){
                res[k]=nums[i];
                i++;
            }else{
                res[k]=nums[j];
                j++;
            }

            k++;
        }
        while(i<=mid){
            res[k]=nums[i];
            i++;
            k++;

        }
        while(j<=high){
            res[k]=nums[j];
            j++;
            k++;
        }

        for(int x = low; x <= high; x++){
             nums[x] = res[x];
            }
    }

     void mergesort(int[] nums, int low , int high,int res[]){
            if(low>=high){
                return;
            }
            int mid= low +((high-low)/2); 
            mergesort(nums,low,mid,res);
            mergesort(nums,mid+1,high,res);

            merge(nums,low,mid,high,res);

       }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
                mergesort(nums,0,n-1,res);
                
        return res;
               
        
    }
}