package model;

import java.util.HashSet;
import java.util.Set;

public class Book {
	
	public Integer id;
	
	public String title;
	
	public Integer price;
	
	public String author;

	public Book() {
		super();
	}

	public Book(Integer id, String title, Integer price, String author) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.author = author;
	}
	
	private static Set<Book> books;
	
	static {
		books = new HashSet<>();
		books.add(new Book(1,"C++",20,"Vinodkumar"));
		books.add(new Book(2,"Java",20,"Bharathkumar"));
	}
	
	public static Set<Book> allBooks(){
		return books;
	}
	
	public static Book findById(Integer id) {
		Book book = (Book) books.stream().filter(b -> b.id == id);
		return book;
	}
	
	public static void add(Book book) {
		books.add(book);
	}
	
	public static void remove(Book book) {
		book.remove(book);
	}

}
