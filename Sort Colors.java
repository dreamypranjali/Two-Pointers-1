class Solution {
    public void sortColors(int[] nums) {
        
        int r = 0;
        int w = 0;
        
        int b = nums.length - 1;
        
        //w should be less than b because beyond b everything is going to be sorted so no need to go there. 
        while(w <= b){
             if(nums[w] == 2){
            swap(w, b, nums);
            b--;
        }
        
        else if(nums[w] == 0){
            swap(w, r, nums);           
            
            r++;
            w++;
            
        }
        //Nothing can be swapped at this point, just move on. 
        else{
            w++;
        }
        }
        
       
        
    }
    
    public void swap(int source, int target, int[] nums){
        int temp  = nums[source];
        nums[source] = nums[target];
        nums[target] = temp;
    }
}