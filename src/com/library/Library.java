package com.library;
import java.util.*;

public class Library {

	
	private HashSet <Book> hs=new HashSet<Book>();
	public Library() {
	}
	public boolean addbook(Book b)
	{
		return hs.add(b);
	}
	public int AllBookCount()
	{
		return hs.size();
	}
	public HashSet<Book> getBooks()
	{
	 return hs;
    }
	public void deleteBook(String b_name)
	{
		  Iterator<Book> iterator = hs.iterator();
	        boolean found = false;
	        while (iterator.hasNext())
	        {
	            Book book = iterator.next();
	            if (book.getBook_name().equalsIgnoreCase(b_name))
	            {
	                iterator.remove();
	                found = true;
	                System.out.println("Book removed Sucessfully!");
	                break;
	            }
	         }
	        try {
	        if(!found)
	        {
	        	IllegalArgumentException obj =new IllegalArgumentException();
	        	throw obj;
	        }
	        }
	        catch(IllegalArgumentException ex)
	        {
	        	System.out.println("Please enter valid book name");
	        }
	}       
}
