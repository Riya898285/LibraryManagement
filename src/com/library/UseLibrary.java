package com.library;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class UseLibrary {
	public static void main(String [] args)
		{
			
				
				int n,j;
				Library L1=new Library();
				System.out.println("Hello! Welcome to Library");
				Scanner sc=new Scanner(System.in);
							
				do {
					System.out.println("Enter 1 for add book");
					System.out.println("Enter 2 for remove Book");
					System.out.println("Enter 3 for view book");
					System.out.println("Enter 4 for exit!");
					System.out.println("Enter your choice");
					n=sc.nextInt();
					Book b=new Book();
					
					
					switch(n)
						{
						case 1:
							int m;
							System.out.println("Enter How many books you want to enter");
							m=sc.nextInt();
							for(int i=0;i<m;i++)
							{
								Book b1=b.setBook();
								L1.addbook(b1);
								System.out.println("Book Added Sucesfully");
							}
							break;
						case 2:
							
							System.out.println("Enter book name which you want to remove:");
							String s=sc.next();
							L1.deleteBook(s);
							break;
							
							
						case 3:
							System.out.println("Books Present in library:");
							HashSet<Book> hs=L1.getBooks();
							
							Iterator<Book> iterator = hs.iterator();
					        while (iterator.hasNext()) {
					            Book b2 = iterator.next();
					            System.out.println("Book Name : "+b2.getBook_name()+" Author Name : "+b2.getAuthor_name());
//					            System.out.println("Author Name : "+b2.getAuthor_name());
					        }
							break;
						case 4:
							System.out.println("Thankyou for using the app!");
							System.exit(0);

						default:
							System.out.println("You entered wrong choice");
							
				        }
					
					
				}while(n!=-1);
		
		
		
	}
}
