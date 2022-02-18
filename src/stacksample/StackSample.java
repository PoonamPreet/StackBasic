package stacksample;

import java.util.Iterator;
import java.util.Stack;

public class StackSample {
public static void main(String[] args) {
	//Stack s1=new Stack();//creating stack object
	Stack<Integer> s1=new Stack<>();//creating stack object with data type
	
	
	//to insert values into the stack 
	s1.push(20);
	s1.push(4);
	s1.push(10);
	
	//printing stack
	System.out.println(s1);
	
	//remove elements from the statck(LIFO)
	s1.pop();
	//print after deletion
	System.out.println(s1);
	
	
	
	//Peek operation
	System.out.println(s1.peek());
	
	
	//is empty operation which has boolean as return type
	boolean status= s1.empty();
	System.out.println(status);	
	
	//search operation which has return type of integer(index value)
	int indexfound=s1.search(4);
	System.out.println(indexfound);
	
	//iterator(how to iterate over stack)
	Iterator it=s1.iterator();
	while(it.hasNext())
	{
		Object s2=it.next();//available elements
		System.out.println("Iterator "+s2);
	}
	
	//size
	System.out.println(s1.size());
	
	//sorting operation
	s1.sort(null);//no criteria mentioned here
	System.out.println(s1);
	
}
}
