class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length;
        LinkedList output = new LinkedList();
        //outer loop for going through each element.
        
        for(int i = 0; i < nums.length; i++){
            int complement = 0 - nums[i];
            left = i + 1;
            right = nums.length - 1;
            
            //run the inner loop until the pointers  cross each other
            
            if(i == 0 || nums[i] != nums[i-1]){
            while(left < right){
                
                if( nums[left] + nums[right] == complement){
                    LinkedList entry = new LinkedList();
                    entry.add(nums[i]);
                    entry.add(nums[left]);
                    entry.add(nums[right]);
                    output.add(entry);
                    left++;
                    //loop for avoiding duplicates
                    
                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                    
                    
                    
                    
                }
                
                if( nums[left] + nums[right] > complement){
                    right--;
                }
                
                //If left + right is less than complement then increment left pointer.
                if( nums[left] + nums[right] < complement){
                    left++;
                }
                
                
                
                
            }
                
                
            
        }
            
      }
            
    return output;
    }
        
        
}
