public class Solution {
	
	public int numRange(ArrayList<Integer> a, int b, int c) {
	     
	int counter =0;
    
	int result =0;
    
	int j;
	for(int i =0; i< a.size(); i++){
            
		result = a.get(i);
            
		if( result >= b && result <= c){
                
			counter++;
            
		}
           
		j = i+1;         

		while(j < a.size()){
                
			result = result+ a.get(j);
                
			if( result >= b && result <= c){
                    
				counter++;
                
			}
                
			else if( result >c){
                   
				break;
                
			}
                
			(j)++;
            
			}
    
		}
    
		return counter;
	
	}

}
