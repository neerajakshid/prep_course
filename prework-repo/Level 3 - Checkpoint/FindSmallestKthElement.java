public class Solution {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	

 public int kthsmallest(final List<Integer> a, int k) {
	    
   	int[] arr = new int[a.size()];
        
	for (int i=0; i < arr.length; i++)
    
	{
        
		arr[i] = a.get(i);
    
	}
	    
	if (k < 1 || arr == null) {
		
		return 0;
	
	}
 
	
	return getKth(k, arr, 0, arr.length - 1);

	}
 


	public int getKth(int k, int[] nums, int start, int end) {
 
	
		int pivot = nums[end];
 
	
		int left = start;
	
		int right = end;
 
	
		while (true) {
 
		
			while (nums[left] < pivot && left < right) {
			
				left++;
		
			}
 
		
			while (nums[right] >= pivot && right > left) {
			
				right--;
		
			}
 
		
			if (left == right) {
			
				break;
		
			}
 
		
		swap(nums, left, right);
	
	}
 
	
	swap(nums, left, end);
 
	
	if (k == left + 1) {
		
		return pivot;
	
	} else if (k < left + 1) {
		
		return getKth(k, nums, start, left - 1);
	
	} else {
		
		return getKth(k, nums, left + 1, end);
	
	}

}
 


public void swap(int[] nums, int n1, int n2) {
	
	int tmp = nums[n1];
	
	nums[n1] = nums[n2];
	
	nums[n2] = tmp;

}

}
