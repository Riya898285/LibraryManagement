package com.lib;

import java.util.Scanner;

import com.library.Book;
import com.library.Library;

public class UseLib {
public static void main(String [] args)
{
	int n,j;
	Scanner sc=new Scanner(System.in);

	
	do{
		System.out.println("Hello! Welcome to Library");
		System.out.println("Enter 1 for add book");
		System.out.println("Enter 2 for remove Book");
		System.out.println("Enter 3 for view book");
		System.out.println("Enter 0 for exit!");
		
		
		System.out.println("Enter your choice");
		n=sc.nextInt();	
		
		
		Lib L1=new Lib();
		Books b=new Books();
		
		
		switch(n)
			{
			case 1:
				int m;
				System.out.println("Enter How many books you want to enter");
				m=sc.nextInt();
				for(j=0;j<m;j++)
				{
					b.set_Book();
					L1.Add_Book(b);
					System.out.println("Book Added Succesfully!");
				}
				break;
			case 2:
				System.out.println("Books Present in library:");
				L1.view_book();
			case 3:
				L1.delete_Book();
				System.out.println("Book Removed Succesfully!");
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Thankyou for using App!");
			}
		}while(true);
	
   }
}
