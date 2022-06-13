public class RemoveElement {
	public int removeElement(int[] nums, int val) {
        int a;
        int last = nums.length-1;
        int k=0;
        for(int i=nums.length-1;i>=0;i--){
           if(nums[i]==val){
               a = nums[i]; 
               nums[i] = nums[last]; 
               nums[last] = a; 
               
               last--; 
               k++; 
           }
        }
        return nums.length-k;
    }
}
