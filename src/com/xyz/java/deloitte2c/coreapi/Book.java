package com.xyz.java.deloitte2c.coreapi;

public class Book {
	private int no_of_pages;
	private String title;
	private String author;
	private String publisher;
	private int current_page;
	private boolean is_open;
	private boolean is_closed;
	
	public Book(){}
	
	public Book(int np, String t, String au, String pub)
	{
		no_of_pages=np;
		title=t;
		author=au;
		publisher=pub;
		current_page=0;
		is_open=false;
		is_closed=true;
	}
	
	public int getPage()
	{
		return current_page;
	}
	public boolean isOpen(){
		return is_open;
	}
	
	public boolean isClosed(){
		return is_closed;
	}
	
	public void open()
	{
		is_open=true;
		is_closed=false;
	}
	
	public void close()
	{
		is_open=false;
		is_closed=true;
	}
	
	public void open(int p)
	{
		current_page=p;
		System.out.println("Book is Opened at page "+current_page);
	}
	
	public int turnLeft()
	{
		current_page+=2;
		if(current_page>no_of_pages)
			return -1;
		else
			return current_page;
	}
	
	public int turnRight()
	{
		current_page-=2;
		if(current_page<=0)
			return -1;
		else
			return current_page;
	}	

	public String getDetails()
	{
		return ("Title: "+title+"\nAuthor: "+author+"\nPublisher: "+publisher);
	}
}
