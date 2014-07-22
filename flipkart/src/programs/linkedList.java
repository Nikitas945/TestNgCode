package programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import org.apache.xml.dtm.ref.DTMDefaultBaseIterators.DescendantIterator;
import org.testng.collections.Sets;

public class linkedList {
	
	public static void main(String[] args) {
		LinkedList<String > list=new LinkedList<>();
		
		list.add("nikita");
		list.add("abhi");
		list.add("peter");
		
		System.out.println(list.get(2));

		list.set(2, "roy");
		
		list.addFirst("williams");
		
		System.out.println(list.clone());
		
	
		System.out.println(list.size());
		
		Iterator<String > it=list.iterator();
		
		while(list.descendingIterator().hasNext())
		{
			System.out.println(it.next());
		}
//		for(Object obj :list)
//		{
//			System.out.println(obj);
//		}
//		
	}

	
}
