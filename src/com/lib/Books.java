package com.lib;

import java.util.Scanner;

public class Books {
	
	private String book_name;
	private String author_name;
	private String topic_name;
	Scanner sc=new Scanner(System.in);
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	@Override
	public String toString() {
		return "Book_Name:"+book_name+",Author_Name"+author_name+",Topic_Name:"+topic_name;
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
	public Books(String book_name, String author_name, String topic_name) {
		super();
		this.book_name = book_name;
		this.author_name = author_name;
		this.topic_name = topic_name;
	}
	public void set_Book()
	{
		System.out.println("Enter Details of Book:");
		book_name=sc.nextLine();
		author_name=sc.nextLine();
		 topic_name=sc.nextLine();
	}
}
