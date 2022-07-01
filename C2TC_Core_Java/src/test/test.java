package test;
import java.util.*;
public class test {
	
	public static void main(String[]args) {
		String ar[]= {"one", "Two", "three", "Four", "five", "six", "one", "three", "Four"};
		String largest=ar[0];
		System.out.println("Min element is:"+largest);
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i].compareTo(ar[j])>0)
				{
					largest=ar[i];
					ar[i]=ar[j];
					ar[j]=largest;
				}
			}
		}
		System.out.println("Max element is:"+largest);
		//replace
		List<String>list=Arrays.asList("one", "Two", "three", "Four", "five", "six", "one", "three", "Four");
		System.out.println("Original list:"+list);
		boolean b = Collections.replaceAll(list, "one", "hundred");
		System.out.println("boolean:"+b);
		System.out.println("List after replace:"+list);	
	}	
}
