public class Solution {
	
	public int longestConsecutive(final List<Integer> a) {
	 
		HashSet<Integer> hashSet = new HashSet<Integer>();
        
		int result = 0;
 
        
		for (int i=0; i<a.size(); ++i)
            
			hashSet.add(a.get(i));
 
     
        
			for (int i=0; i<a.size(); ++i)
        {
        
            
				if (!hashSet.contains(a.get(i)-1))
            {
            
                
					int j = a.get(i);
                
					while (hashSet.contains(j))
                    
						j++;
 
              
                
					if (result<j-a.get(i))
                    
						result = j-a.get(i);
            
			}
        
		}
        
		return result;
    
	}

}
