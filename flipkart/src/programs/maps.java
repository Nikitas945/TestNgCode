package programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;




public class maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<String ,String> hm=new HashMap<>();
		
		hm.put("1", "nikita");
		hm.put("1", "jack"); 
				
		hm.put("2", "abhi");
		
		System.out.println(hm.keySet());
		
		System.out.println(hm.entrySet());
		
		Set set=hm.entrySet();  
		  Iterator itr=set.iterator();  
		  
		  while(itr.hasNext()){  
		   Map.Entry m=(Map.Entry)itr.next();  
		   System.out.println(m.getKey()+" "+m.getValue()); 
	}

}
}
