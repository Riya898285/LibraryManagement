package com.library;

import java.util.Scanner;
public class Book {


	
	

	private String book_name;
	private String author_name;
	private String topic_name;
//	
//	public Book(String book_name, String author_name, String topic_name) {
//		super();
//		this.book_name = book_name;
//		this.author_name = author_name;
//		this.topic_name = topic_name;
//	}
	public Book setBook()
	{
		Book b1=new Book();
		System.out.println("Enter details of book");
		Scanner sc=new Scanner(System.in);
		System.out.print("Book Name:");
		b1.setBook_name(sc.nextLine());
		System.out.print("Author Name:");
		b1.setAuthor_name(sc.nextLine());
//		System.out.print("Topic Name");
//		b1.setTopic_name(sc.nextLine());
		return b1;
	}
	
	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public String getTopic_name() {
		return topic_name;
	}

	public void setTopic_name(String topic_name) {
		this.topic_name = topic_name;
	}

	@Override
	public String toString() {
		return "Book name:" + book_name +"," + "author Name:" +author_name+"," + "Topic Name:" + topic_name;
	}
	
	
	
	
}
