class Solution {
    public int trap(int[] height) {
        if(height==null || height.length==0){
            return 0;
        }

        int l=0;
        int r=height.length-1;
        int left=height[l];
        int right=height[r];
        int res=0;

        while(l<r){
            if(left<right){
                l++;
                left=Math.max(left,height[l]);
                res+=left-height[l];
            }
            else{
                r--;
                right=Math.max(right,height[r]);
                res+=right-height[r];
            }
        }
        return res;
    }
}
