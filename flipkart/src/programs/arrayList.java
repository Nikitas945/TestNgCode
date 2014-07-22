package programs;

import java.util.ArrayList;

public class arrayList {

	
	public static void main(String[] args) {
		
		ArrayList< String> list=new ArrayList<>();
		
		list.add("nikita");
		list.add("abhi");
		list.add("jack");
		list.add("peter");
		
		ArrayList<String > list2=new ArrayList<>();
		
		list2.add("nikita2");
		list2.add("abhi2");
		list2.add("jack");
		list2.add("peter");
		
		list2.addAll(list);
		System.out.println("list in format is ........"+ list.clone());
		
		System.out.println("list contains abhi ..??"+ list.contains("abhi"));
		
		System.out.println("get element at 3rd position "+ list.get(2));
		
//		System.out.println(list.retainAll(list2));
		
		System.out.println("last index is .." + list.lastIndexOf(list2));
		
		for(Object obj : list)
		{
			System.out.println(obj);
		}
				
	}
}
