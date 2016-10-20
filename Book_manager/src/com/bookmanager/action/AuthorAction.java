package com.bookmanager.action;

import java.util.List;

import com.bookmanager.model.Author;
import com.bookmanager.model.Book;
import com.bookmanager.service.AuthorService;
import com.bookmanager.service.BookService;
import com.opensymphony.xwork2.ActionSupport;

public class AuthorAction extends ActionSupport{

	private List<Author> authors;
	private List<Book> books;
	private AuthorService authorService = new AuthorService(); 
	private BookService bookService= new BookService();
	private Author author;
	private int AuthorID;
	private String Name;
	
	public String list() {
		//authors = authorService.query();
		return SUCCESS;
	}
	public String query() {
		//System.out.println(AuthorID);
		authors = authorService.query(AuthorID);
		return SUCCESS;
	}
	public String search() {
		//System.out.println(Name);
		setBooks(bookService.search(Name));
		return SUCCESS;
	}
	
	public String add() {
		authorService.add(author);
		return SUCCESS;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	public AuthorService getAuthorService() {
		return authorService;
	}
	public void setAuthorService(AuthorService authorService) {
		this.authorService = authorService;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
		//System.out.println(book.getISBN()+"action\n");
	}
	public int getAuthorID() {
		return AuthorID;
	}
	public void setAuthorID(int AuthorID) {
		this.AuthorID = AuthorID;
	}
	public String getName(){
		return Name;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
}
