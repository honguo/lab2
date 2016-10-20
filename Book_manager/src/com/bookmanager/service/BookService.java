package com.bookmanager.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookmanager.model.Book;
import com.bookmanager.util.DB;


public class BookService {

	public void add(Book c) {
		Connection conn = DB.createConn();
		String sql = "insert into Book values ( ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = DB.prepare(conn, sql);
		try {
			ps.setString(1, c.getISBN());
			ps.setString(2, c.getTittle());
			ps.setInt(3, c.getAuthorID());
			ps.setString(4, c.getPublisher());
			ps.setDate(5, c.getPublishDate());
			ps.setDouble(6, c.getPrice());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(ps);
		DB.close(conn);
	}
	
	public List<Book> list() {
		Connection conn = DB.createConn();
		String sql = "select * from Book";
		PreparedStatement ps = DB.prepare(conn, sql);
		List<Book> categories = new ArrayList<Book>();
		try {
			ResultSet rs = ps.executeQuery();
			Book c = null;
			while(rs.next()) {
				c = new Book();
				c.setISBN(rs.getString("ISBN"));
				c.setTittle(rs.getString("Tittle"));
				c.setAuthorID(rs.getInt("AuthorID"));
				c.setPublisher(rs.getString("Publisher"));
				c.setPublishDate(rs.getDate("PublishDate"));
				c.setPrice(rs.getDouble("Price"));
				
				categories.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(ps);
		DB.close(conn);
		return categories;
	}
	
	public List<Book> query(int AuthorID) {
		Connection conn = DB.createConn();
		String sql = "select * from Book where AuthorID=?";
		PreparedStatement ps = DB.prepare(conn, sql);
		List<Book> categories = new ArrayList<Book>();
		try {
			ps.setInt(1, AuthorID);
			ResultSet rs = ps.executeQuery();
			Book c = null;		
			while(rs.next()) {
				c = new Book();
				c.setISBN(rs.getString("ISBN"));
				c.setTittle(rs.getString("Tittle"));
				c.setAuthorID(rs.getInt("AuthorID"));
				c.setPublisher(rs.getString("Publisher"));
				c.setPublishDate(rs.getDate("PublishDate"));
				c.setPrice(rs.getDouble("Price"));				
				categories.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(ps);
		DB.close(conn);
		return categories;
	}
	
	public List<Book> detail(String Tittle) {
		Connection conn = DB.createConn();
		String sql = "select * from Book where Tittle=?";
		PreparedStatement ps = DB.prepare(conn, sql);
		List<Book> books = new ArrayList<Book>();
		try {
			ps.setString(1, Tittle);
			ResultSet rs = ps.executeQuery();
			Book c = null;		
			while(rs.next()) {
				c = new Book();
				c.setISBN(rs.getString("ISBN"));
				c.setTittle(rs.getString("Tittle"));
				c.setAuthorID(rs.getInt("AuthorID"));
				String aa=null;
				aa=rs.getString("Publisher");
				System.out.println(aa);
				c.setPublisher(rs.getString("Publisher"));
				c.setPublishDate(rs.getDate("PublishDate"));
				c.setPrice(rs.getDouble("Price"));				
				books.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(ps);
		DB.close(conn);
		return books;
	}
	
	
	public List<Book> search(String Name) {
		Connection conn = DB.createConn();
		String sql1 = "select * from Author where Name=?";
		String sql2 = "select * from Book where AuthorID=?";
		PreparedStatement ps1 = DB.prepare(conn, sql1);
		PreparedStatement ps2 = DB.prepare(conn, sql2);
		List<Book> books = new ArrayList<Book>();
		try {
			ps1.setString(1, Name);		
			ResultSet rs1 = ps1.executeQuery();
			
			int id=0;
			while(rs1.next()){
				id=rs1.getInt("AuthorID");
				//System.out.println(id);
			}
			ps2.setInt(1,id);
			ResultSet rs2 = ps2.executeQuery();
			Book c = null;		
			while(rs2.next()) {
				c = new Book();
				c.setISBN(rs2.getString("ISBN"));
				c.setTittle(rs2.getString("Tittle"));
				c.setAuthorID(rs2.getInt("AuthorID"));
				c.setPublisher(rs2.getString("Publisher"));
				c.setPublishDate(rs2.getDate("PublishDate"));
				c.setPrice(rs2.getDouble("Price"));				
				books.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(ps1);
		DB.close(ps2);
		DB.close(conn);
		return books;
	}
	public void update(Book c) {
		Connection conn = DB.createConn();
		String sql = "update Book set Tittle = ? , AuthorID = ?, Publisher = ?, PublishDate = ?,Price = ? where ISBN = ? ";
		PreparedStatement ps = DB.prepare(conn, sql);
		try {
			ps.setString(6, c.getISBN());
			ps.setString(1, c.getTittle());
			ps.setInt(2, c.getAuthorID());
			ps.setString(3, c.getPublisher());
			ps.setDate(4, c.getPublishDate());
			ps.setDouble(5, c.getPrice());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(ps);
		DB.close(conn);
	}
	

	public void delete(Book c) {
		c=new Book();
		//System.out.println(c.getISBN());
		deleteByISBN(c.getISBN());
		//System.out.println(c.getISBN());
	}
	
	public void deleteByISBN(String isbn) {
		System.out.println("shanchu1\n");
		Connection conn = DB.createConn();
		String sql = "delete from Book where ISBN = ?";
		PreparedStatement ps = DB.prepare(conn, sql);
		try {
			ps.setString(1, isbn);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(ps);
		DB.close(conn);
	}
	
	public Book loadByISBN(String ISBN) {
		Connection conn = DB.createConn();
		String sql = "select * from Book where ISBN = ?";
		PreparedStatement ps = DB.prepare(conn, sql);
		Book c = null;
		try {
			ps.setString(1, ISBN);
			ResultSet rs = ps.executeQuery();
		
			if(rs.next()) {
				c = new Book();
				c.setISBN(rs.getString("ISBN"));
				c.setTittle(rs.getString("Tittle"));
				c.setAuthorID(rs.getInt("AuthorID"));
				c.setPublisher(rs.getString("Publisher"));
				c.setPublishDate(rs.getDate("PublishDate"));
				c.setPrice(rs.getDouble("Price"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(ps);
		DB.close(conn);
		return c;
	}
	
}
