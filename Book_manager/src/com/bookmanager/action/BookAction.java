package com.bookmanager.action;
import java.util.List;

import com.bookmanager.model.Book;
import com.bookmanager.model.Author;
import com.bookmanager.service.BookService;
import com.bookmanager.service.AuthorService;
import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport{
	private List<Book> books;
	private List<Author> authors;
	private BookService bookService = new BookService(); 
	private AuthorService authorService = new AuthorService();
	private Book Book;
	private String ISBN;
	private String Name;
	private String Tittle;
	private int AuthorID;
	
	public String list() {
		books = bookService.list();
		return SUCCESS;
	}
	public String query() {
		//System.out.println(AuthorID);
		books = bookService.query(AuthorID);
		return SUCCESS;
	}
	public String search() {
		//System.out.println(Name);
		books = bookService.search(Name);
		return SUCCESS;
	}
	public String add() {
		bookService.add(Book);
		return SUCCESS;
	}
	public String update() {
		//System.out.println(book.getISBN()+"action");
		bookService.update(Book);
		//categoryService.update(category);
		return SUCCESS;
	}
	public String updateInput() {
		//bookService.update(book);
		this.Book = this.bookService.loadByISBN(ISBN);
		return INPUT;
	}
	public String delete() {		
		bookService.deleteByISBN(ISBN);
		return SUCCESS;
		}
	
	public String detail() {	
		System.out.println(Tittle+"action");
		books=bookService.detail(Tittle);
		setAuthors(authorService.detail(Tittle));
		return SUCCESS;
		}
	
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public BookService getBookService() {
		return bookService;
	}
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	public Book getBook() {
		return Book;
	}
	public void setBook(Book Book) {
		this.Book = Book;
		System.out.println(Book.getISBN()+"action2\n");
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	public String getTittle() {
		return Tittle;
	}
	public void setTittle(String Tittle) {
		this.Tittle = Tittle;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public int getAuthorID() {
		return AuthorID;
	}
	public void setAuthorID(int AuthorID) {
		this.AuthorID = AuthorID;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	
}

