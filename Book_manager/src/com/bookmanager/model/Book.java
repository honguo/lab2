package com.bookmanager.model;

import java.sql.Date;

public class Book {

	private String ISBN;
	private String Tittle;
	private int AuthorID;
	private String Publisher;
	private Date PublishDate;
	private double Price;
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	public int getAuthorID() {
		return AuthorID;
	}
	public void setAuthorID(int AuthorID) {
		this.AuthorID = AuthorID;
	}
	public String getTittle() {
		return Tittle;
	}
	public void setTittle(String Tittle) {
		this.Tittle = Tittle;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double Price) {
		this.Price = Price;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String Publisher) {
		this.Publisher = Publisher;
	}
	public Date getPublishDate() {
		return PublishDate;
	}
	public void setPublishDate(Date PublishDate) {
		this.PublishDate = PublishDate;
	}
	
}
