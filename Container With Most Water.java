class Solution {
    public int maxArea(int[] height) {
        
        //Initialize 2 pointers.
        
        int left = 0;
        int right = height.length - 1;
        int maxArea = Integer.MIN_VALUE;
        
        for(int i = 0; i < height.length; i++){
            
            //We will compare the vales at both the pointers and move the one which has lesser value.
            
            while(left < right){
                
                int minheight = Math.min(height[left], height[right]);
                int area = minheight * (right - left);
                
                if(area > maxArea){
                    maxArea = area;
                }
                
                if(height[left] < height[right]){
                    left++;
                }
                
                else{
                    right--;
                }
                
                
                
            }
        }
        
        return maxArea;
    }
}