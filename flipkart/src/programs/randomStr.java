package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class randomStr {
	
	public static void main(String[] args) {
//		Random r=new Random();
//		char ch[]="hinikitahowareyou123456789".toCharArray();
//		
//		StringBuilder sb=new StringBuilder();
//		
//	
//	for(int i=0;i<5;i++){
//		char c = ch[r.nextInt(ch.length)];
//	    sb.append(c);
//	}
//	    System.out.println(sb.toString());
		
		
		
		//================================================================================================
		
	Random r=new Random();
	char  ch[]= "bbhjgmjhbm,jhkj".toCharArray();
	
	StringBuilder sb=new StringBuilder();
	
	for(int i=0;i<4;i++)
	{
	   char c=ch[r.nextInt(ch.length)];
	   sb.append(c);
	   
	}
		System.out.println(sb);
	}

}
