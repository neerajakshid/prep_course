public class Solution {
	
	public ArrayList<ArrayList<Integer>> prettyPrint(int a) {
	    
	     
		int c=a;
        
		a+=a-1;
        
		ArrayList<ArrayList<Integer>> n = new ArrayList<ArrayList<Integer>>();
        
		ArrayList<Integer> temp = new ArrayList<Integer>();
        
		for(int i=0;i<a;i++)
           
			temp.add(0);
       
       
		for(int i=0;i<a;i++)
          
			n.add(new ArrayList<Integer>(temp));
      
       
		for(int i=0;i<=a/2;i++)
       
		{
           
			for(int j=i;j<a-i;j++)
           
			{
               
				n.get(i).set(j,c);
               
				n.get(a-1-i).set(j,c);
               
				n.get(a-1-j).set(i,c);
               
				n.get(a-1-j).set(a-1-i,c);
           
			}
           
			c--;
       
		}

      
		return n;  
	
	}

}
