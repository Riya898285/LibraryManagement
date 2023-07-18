package com.lib;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.library.Book;

public class Lib {

	HashSet<Books> hs=new HashSet<>();
	Scanner sc=new Scanner(System.in);
	Book b=new Book();

	public boolean Add_Book(Books b)
	{
		return hs.add(b);
	}
	public void view_book()
	{
		Iterator<Books> it=hs.iterator();
		while(it.hasNext())
		{
			Books b1=it.next();
			System.out.println(b1);
		}
		
	}
	public void delete_Book()
	{
		System.out.println("Ente book name:");
		String bname=sc.nextLine();
		hs.remove(b);
		
	}
	


}
